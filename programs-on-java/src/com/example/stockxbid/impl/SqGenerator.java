package com.example.stockxbid.impl;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.time.Instant;

public class SqGenerator {

	// Custom Epoch (January 1, 2015 Midnight UTC = 2015-01-01T00:00:00Z)
	private static final long CUSTOM_EPOCH = 1420070400000L;

	private static volatile long lastTimestamp = -1L;

	private SqGenerator() {

	}

	private static class SingletonHelper {
		private static final SqGenerator INSTANCE = new SqGenerator();
	}

	public static SqGenerator getInstance() {
		return SingletonHelper.INSTANCE;
	}

	public String secureRandom() {

		Long userId = 3000L;
		int qty = 1000;
		Long customerId = 500000L;
		Long shoppingCartId = 1500000L;
		Long shoppingCartItemId = 3400000L;

		Long time = currentTime();

		Long subTot = (time + userId + qty + customerId + shoppingCartId + shoppingCartItemId);

		SecureRandom random = null;
		try {
			random = SecureRandom.getInstance("SHA1PRNG");
		} catch (NoSuchAlgorithmException e) {
		}

		Long total = subTot;

		String timeString = String.valueOf(total);
		timeString += timeString + Math.floor(random.nextInt() * 10);

		return String.join("-", timeString.subSequence(0, 4), timeString.substring(4, 10), timeString.substring(10, 14))
				.intern();
	}

	private static synchronized long currentTime() {
		long currentTimestamp = timestamp();

		if (currentTimestamp < lastTimestamp) {
			throw new IllegalStateException("Invalid System Clock!");
		}

		if (currentTimestamp == lastTimestamp) {

			// Sequence Exhausted, wait till next millisecond.
			currentTimestamp = waitNextMillis(currentTimestamp);

		}

		lastTimestamp = currentTimestamp;

		return currentTimestamp;
	}

	// Get current timestamp in milliseconds, adjust for the custom epoch.
	private static long timestamp() {
		return Instant.now().toEpochMilli() - CUSTOM_EPOCH;
	}

	// Block and wait till next millisecond
	private static long waitNextMillis(long currentTimestamp) {
		while (currentTimestamp == lastTimestamp) {
			currentTimestamp = timestamp();
		}
		return currentTimestamp;
	}

}
