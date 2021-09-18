package com.example.factory;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HappiestMindsTest {

	static int[] nums = { 1, 2, 1, 3, 2, 1, 2, 2, 1, 2, 2, 1 ,1,1};

	/*
	 * result = 2 and number of times
	 */

	public static void main(String[] args) {

		findSecHighNumRep(nums);

	}

	private static void findSecHighNumRep(int[] nums) {

		List<Integer> numList = Arrays.stream(nums).boxed().collect(Collectors.toList());

		Map<Object, List<Integer>> collector = numList.stream().collect(Collectors.groupingBy(num -> num));

		collector.entrySet().forEach(System.out::println);

		getSecHighestKey(collector);

	}

	private static void getSecHighestKey(Map<Object, List<Integer>> collector) {

		int size = collector.entrySet().stream().map(entry -> entry.getValue()).map(arr -> arr.size())
				.collect(Collectors.toList()).stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList())
				.get(1);

		System.out.println(size);

		int num = (int) collector.entrySet().stream().filter(entry->entry.getValue().size() == size).findFirst().get().getKey();
		
		System.out.println(num);
	}

}
