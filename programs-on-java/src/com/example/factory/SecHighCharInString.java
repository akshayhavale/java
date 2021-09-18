package com.example.factory;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SecHighCharInString {

	static String str = "geekforgeeks";

	public static void main(String[] args) {
		findSecHighCharRep(str);
	}

	private static void findSecHighCharRep(String str) {

		List<Character> charList = str.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

		Map<Object, List<Character>> collector = charList.stream().collect(Collectors.groupingBy(chars -> chars));

		collector.entrySet().forEach(System.out::println);

		getSecHighestKey(collector);

	}

	private static void getSecHighestKey(Map<Object, List<Character>> collector) {

		int size = collector.entrySet().stream().map(entry -> entry.getValue()).map(arr -> arr.size())
				.collect(Collectors.toList()).stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList())
				.get(1);

		System.out.println(size);

		char chars = (char) collector.entrySet().stream().filter(entry -> entry.getValue().size() == size).findFirst()
				.get().getKey();

		System.out.println(chars);
	}

}
