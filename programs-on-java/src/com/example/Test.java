package com.example;

public class Test {

	public static void main(String args[]) {
		System.out.println(getAccountNumber("123", "sav"));
		
		int a = 300;
		byte b = (byte)a;
		System.out.println(b);
	}

	public static String getAccountNumber(String accountNumber, String accountType) {

		return accountType != null ? new StringBuilder().append(accountNumber).append(accountType).toString()
				: accountNumber;
	}

}
