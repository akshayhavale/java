package com.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {

		List<String> linkedList = new LinkedList<>();

		linkedList.add("Akshay");
		linkedList.add("P");
		linkedList.add("Havale");
		
		List<String> arrayList = new ArrayList<>();
		
		arrayList.add("Akshay");
		arrayList.add("P");
		arrayList.add("Havale");

		/*
		 * Get Index By Word
		 */
		// check Akshay index number

		int index = linkedList.indexOf("Akshay");
		System.out.println(index);
		
		int index = arrayList.
	}

}
