package com.example;

/**
 * 
 * 
 * @author akshayhavale
 *
 */
public class OwelsCounter {

	public static void main(String args[]) {
		
		
		System.out.println(countOwels("Akshay is very good software developer"));

	}

	private static int countOwels(String sentence) {
		/*
		 * Counter for count the number of owel chars
		 */
		int count = 0;
		/*
		 * Convert to lowercase to avoid checking
		 */
		String lowerCaseSent = sentence.toLowerCase();
		/*
		 * Convert String to charcater's array
		 */
		char[] chars = lowerCaseSent.toCharArray();

		/*
		 * Iterate as loop
		 */
		for (char c : chars) {

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

				count++;

			}

		}

		return count;

	}

}
