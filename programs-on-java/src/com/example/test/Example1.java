package com.example.test;

/**
 * Format Verifier
 * 
 * @author akshayhavale
 *
 */
public class Example1 {

	public static void main(String args[]) {

		System.out.println(verifySentence("#"));
		
		int i = 0/10;
		System.out.println(i);

	}

	private static boolean verifySentence(String sent) {

		/*
		 * 1) check the sent container # in between
		 */

		if (sent.contains("#")) {

			/*
			 * 2) devide the words from #
			 */

			String[] words = sent.split("#");

			/*
			 * 3) Verify Length of 2 words
			 */
			if (words.length > 2) {
				if (words[0].length() == words[1].length()) {

					/*
					 * 4) reverse the second word and check both are equal
					 */
					String reveredWord = new StringBuffer().append(words[1]).reverse().toString();

					if (words[0].equalsIgnoreCase(reveredWord)) {
						return true;
					} else {
						return false;
					}

				} else {
					return false;
				}
			} else {
				return false;
			}

		} else {
			return false;
		}

	}

}
