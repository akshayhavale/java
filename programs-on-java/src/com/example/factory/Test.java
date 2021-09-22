package com.example.factory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
	/*
	 * 1) Only alphabets it contains
	 * 
	 */
	static String str = "abacbabstrejnooni";

	/*
	 * astrejno
	 */

	public static void main(String[] args) {

		System.out.println(getUniqueString(str));

	}

	private static String getUniqueString(String str) {

		char[] characters = str.toCharArray();

		/*
		 * Step1) First repeated characters
		 */

		Set<Character> uniqueFinder = new HashSet<>();

		List<String> words = new ArrayList<>();

		String temp = "";
		for (char c : characters) {

			if (uniqueFinder.add(c)) {
				temp = temp + c;
			} else {
				words.add(temp);
				uniqueFinder.clear();
				temp = "";
				temp = temp + c;
				uniqueFinder.add(c);
			}

		}

		/*
		 * 2) I need check the String length which having max length
		 */
		int size = 0;
		String lengthyUniqueString = "";
		for (String s : words) {

			if (size < s.length()) {
				size = s.length();
				lengthyUniqueString = s;
			}

		}

		return lengthyUniqueString;

	}

}
