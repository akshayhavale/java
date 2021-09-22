package com.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BubbleSort {

	static int[] nums = { 2, 3, 1, 5, 4 };

	public static void main(String[] args) {

		System.out.println("Intial Array format");
		for (int i : nums) {
			System.out.println(i);
		}

		nums = sortByCollectionDefaultSortMethod(nums);
		System.out.println("Final Array format");
		for (int i : nums) {
			System.out.println(i);
		}
	}

	private static int[] sortByCollectionDefaultSortMethod(int[] nums) {

		/**
		 * 
		 * 1) Considering collection in built method sort
		 * 
		 * -> Problem is it only takes list to sort so we can convert that as list and
		 * refill into another int[]
		 * 
		 */
		List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
		Collections.sort(list);

		int[] sortedArray = list.stream().mapToInt(Integer::valueOf).toArray();

		return sortedArray;

	}

}
