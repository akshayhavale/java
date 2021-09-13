package com.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * Find Duplicate First word in sentence
 * 
 * @author akshayhavale
 *
 */
public class DuplicationFinder {

	public static void main(String args[]) {

		String sentence = "Akshay had been saying that Akshay had been there";

		printFirstDuplicate(sentence);

	}

	private static void printFirstDuplicate(String sentence) {

		Set<String> verifier = new HashSet<>();

		String[] words = sentence.split(" ");

		/*
		 * Approach 1
		 */
		for (String word : words) {
			if (verifier.add(word)) {

			} else {
				System.out.println(word);
				break;
				
			}

		}

		/*
		 * 
		 * Approach 2
		 * 
		 */

		List<String> list = new ArrayList<>();

		for (String word : words) {
			list.add(word);
		}

		Optional<String> findFirst = list.stream().distinct().findFirst();

		if (findFirst.isPresent()) {
			System.out.println(findFirst.get());
		}
		

	}

}
