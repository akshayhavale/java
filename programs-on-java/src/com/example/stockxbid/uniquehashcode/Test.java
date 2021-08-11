package com.example.stockxbid.uniquehashcode;

import java.sql.Timestamp;
import java.util.Date;

public class Test {

	public static void main(String[] args) {

		OrderNumber orderNumber = new OrderNumber(10000000L, 10000000L, 10000000L, new Timestamp(new Date().getTime()));

		System.out.println(orderNumber.hashCode());

	}

}
