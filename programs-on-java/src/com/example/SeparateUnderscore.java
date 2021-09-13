package com.example;

public class SeparateUnderscore {

	public static void main(String args[]) {
		
		System.out.println(separate("NEW UPLOADS"));

	}

	private static String separate(String str) {

		String[] words = str.split("_");

		StringBuilder name = new StringBuilder();

		for (String word : words) {
			name.append(word).append(" ");
		}

		return name.toString().trim();
	}

}
