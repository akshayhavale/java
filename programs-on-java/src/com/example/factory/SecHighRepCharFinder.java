package com.example.factory;

import java.util.HashSet;
import java.util.Set;

public class SecHighRepCharFinder {

	static String str = "geekforgeeks";

	public static void main(String[] args) {

		printSecHighCharApprochOne(str);

	}

	private static void printSecHighCharApprochOne(String word) {

		char[] chars = word.toCharArray();

		Set<Character> uniqueFinder = new HashSet<>();

		for (char ch : chars) {
			if (uniqueFinder.add(ch))
				;
		}

		int[] sizeArray = new int[uniqueFinder.size()];
		int index = 0;
		for (char ch : uniqueFinder) {
			int length = 0;
			for (int i = 0; i < chars.length; i++) {
				if (ch == chars[i]) {
					length++;
				}
			}
			sizeArray[index] = length;
			index++;
		}

		int maxLength = 0;
		int firstMaxLengthIndex = 0;
		int secondMaxLength = 0;
		int secondMaxLengthIndex = 0;
		for (int i = 0; i < sizeArray.length; i++) {
			if (maxLength < sizeArray[i]) {
				secondMaxLength = maxLength;
				maxLength = sizeArray[i];
				firstMaxLengthIndex = i;
			}
			if (sizeArray[i] != maxLength && secondMaxLength < sizeArray[i]) {
				secondMaxLength = sizeArray[i];
				secondMaxLengthIndex = i;
			}
		}

		char maxRepChar = 0;
		char secondMaxRepChar = 0;
		int pointer = 0;
		for (char ch : uniqueFinder) {
			if (pointer == firstMaxLengthIndex) {
				maxRepChar = ch;
			}

			if (pointer == secondMaxLengthIndex) {
				secondMaxRepChar = ch;
			}
			pointer++;
		}

		System.out.println("MaxRepChar = " + maxRepChar + ", Repeated By Nos =" + maxLength);
		System.out.println("SecondMaxRepChar = " + secondMaxRepChar + ", Repeated By Nos =" + secondMaxLength);

	}

}
