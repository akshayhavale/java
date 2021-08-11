package com.example.stockxbid.uniquehashcode;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

	private static Long userId = 3000L;
	private static int qty = 1000;
	private static Long customerId = 500000L;
	private static Long shoppingCartId = 1500000L;
	private static Long shoppingCartItemId = 3400000L;

	private static long a = 10;

	private static Set<String> unique = new HashSet<>();

	private static List<String> repeat = new ArrayList<>();

	// Custom Epoch (January 1, 2015 Midnight UTC = 2015-01-01T00:00:00Z)
	private static final long CUSTOM_EPOCH = 1420070400000L;
	
	private volatile long lastTimestamp = -1L;

	public static Long getID() {

//		// 10 digits.
//		Long id = (System.currentTimeMillis()) / 100 % LIMIT;
//		Long us = userId / 100 % LIMIT;
//		Long qt = qty / 100 % LIMIT;
//		Long cs = customerId / 100 % LIMIT;
//		Long sc = shopCartId / 100 % LIMIT;
//		Long sci = shopCartItem / 100 % LIMIT;
//
//		Long tt = (id + us + qt + cs + sc + sci) / 100 % LIMIT;
//		return tt;
		return null;

	}

	public static void main(String[] args) {

//		System.out.println(getID());
//		
//		Random random = new Random(1000000000);
//		long a = random.nextLong();
//		int b = random.nextInt();
//		System.out.println(a);
//		System.out.println(b);

//		
//		Order order = new Order(10000000000L,100000000L);
//		System.out.println(order.hashCode()%10000000000000000L);

		for (int i = 1; i < 10001; i++) {
			String secNum = secureRandom();
			if (unique.add(secNum)) {
				System.out.println(secNum);
			} else {
				repeat.add(secNum);
			}

		}

		System.out.println(repeat.size());

	}

	private static String generateOrderNumber() {

		SecureRandom random = null;
		try {
			random = SecureRandom.getInstance("SHA1PRNG");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String now = String.valueOf(System.currentTimeMillis() + 30000000 + 30000000);

		now += now + Math.floor(random.nextInt() * 10);

		String str = String.join("-", now.subSequence(0, 4), now.substring(4, 10), now.substring(10, 14)).intern();

		return str;

	}

	private static String secureRandom() {

		Date startedDate = new Date(2020, 01, 1);

		long stLong = startedDate.getTime();

		long timeT = System.currentTimeMillis();

		long diff = stLong - timeT;

		Long time = diff;

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

	// Get current timestamp in milliseconds, adjust for the custom epoch.
	private static long timestamp() {
		return Instant.now().toEpochMilli() - CUSTOM_EPOCH;
	}

}
