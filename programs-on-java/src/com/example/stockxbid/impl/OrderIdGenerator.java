package com.example.stockxbid.impl;

import java.rmi.server.UID;
import java.util.UUID;

public class OrderIdGenerator {

	private static Long userId = 1L;
	private static Long orderId = 200L;
	private static Long orderProductId = 1L;
	private static final String UNDER_SCORE = "-";

	public static void main(String[] args) {
		
		System.out.println(generateOrderNumber(userId, orderId, orderProductId));
		generate();

	}

	public static String generateOrderNumber(Long userId, Long orderId, Long orderProductId) {
		
		StringBuilder num = new StringBuilder();
	
		num.append(userId).append(UNDER_SCORE).append(orderId).append(UNDER_SCORE).append(orderProductId);
		
		UUID  uuid = UUID.nameUUIDFromBytes(num.toString().getBytes());
		
		return uuid.toString();
		
	}


	  /**
	  * Build and display some UID objects.
	  */
	  public static void  generate() {
	    for (int idx=0; idx<10; ++idx){
	      UID userId = new UID();
	      System.out.println("User Id: " + userId);
	    }
	  }
}
