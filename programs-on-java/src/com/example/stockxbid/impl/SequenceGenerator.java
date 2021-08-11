package com.example.stockxbid.impl;

import java.io.Serializable;
import java.net.NetworkInterface;
import java.security.SecureRandom;
import java.time.Instant;
import java.util.Enumeration;

/**
 * https://www.callicoder.com/distributed-unique-ID-sequence-number-generator/
 * 
 * @author akshayhavale
 *
 */
public class SequenceGenerator implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1575999632793629656L;

	private static final int UNUSED_BITS = 1; // Sign bit, Unused (always set to 0)
	private static final int EPOCH_BITS = 41;
	private static final int NODE_ID_BITS = 10;
	private static final int SEQUENCE_BITS = 12;

	private static final int maxNodeId = (int) (Math.pow(2, NODE_ID_BITS) - 1);
	private static final int maxSequence = (int) (Math.pow(2, SEQUENCE_BITS) - 1);

	// Custom Epoch (January 1, 2015 Midnight UTC = 2015-01-01T00:00:00Z)
	private static final long CUSTOM_EPOCH = 1420070400000L;

	private final int nodeId;

	private volatile long lastTimestamp = -1L;
	private volatile long sequence = 0L;

	/**
	 * 
	 * To make this class as singleton by
	 * 
	 * https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples#bill-pugh-singleton
	 */
	private static class SingletonHelper {
		private static final SequenceGenerator INSTANCE = new SequenceGenerator();
	}

	private static SequenceGenerator getInstance() {
		return SingletonHelper.INSTANCE;
	}

	protected static Object readResolve() {
		return getInstance();
	}

	// Let SequenceGenerator generate a nodeId
	private SequenceGenerator() {
		this.nodeId = createNodeId();
	}

	public synchronized long nextId() {
		long currentTimestamp = timestamp();

		if (currentTimestamp < lastTimestamp) {
			throw new IllegalStateException("Invalid System Clock!");
		}

		if (currentTimestamp == lastTimestamp) {
			sequence = (sequence + 1) & maxSequence;
			if (sequence == 0) {
				// Sequence Exhausted, wait till next millisecond.
				currentTimestamp = waitNextMillis(currentTimestamp);
			}
		} else {
			// reset sequence to start with zero for the next millisecond
			sequence = 0;
		}

		lastTimestamp = currentTimestamp;

		long id = currentTimestamp << (NODE_ID_BITS + SEQUENCE_BITS);
		id |= (nodeId << SEQUENCE_BITS);
		id |= sequence;
		return id;
	}

	// Get current timestamp in milliseconds, adjust for the custom epoch.
	private static long timestamp() {
		return Instant.now().toEpochMilli() - CUSTOM_EPOCH;
	}

	// Block and wait till next millisecond
	private long waitNextMillis(long currentTimestamp) {
		while (currentTimestamp == lastTimestamp) {
			currentTimestamp = timestamp();
		}
		return currentTimestamp;
	}

	private int createNodeId() {
		int nodeId;
		try {
			StringBuilder sb = new StringBuilder();
			Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
			while (networkInterfaces.hasMoreElements()) {
				NetworkInterface networkInterface = networkInterfaces.nextElement();
				byte[] mac = networkInterface.getHardwareAddress();
				if (mac != null) {
					for (int i = 0; i < mac.length; i++) {
						sb.append(String.format("%02X", mac[i]));
					}
				}
			}
			nodeId = sb.toString().hashCode();
		} catch (Exception ex) {
			nodeId = (new SecureRandom().nextInt());
		}
		nodeId = nodeId & maxNodeId;
		return nodeId;
	}

}
