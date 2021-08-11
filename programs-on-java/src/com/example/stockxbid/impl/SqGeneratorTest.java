package com.example.stockxbid.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SqGeneratorTest {
	
	private static Set<String> unique = new HashSet<>();

	private static List<String> repeat = new ArrayList<>();
	
	public static void main(String args[]) {
		
		
		for(int i =0; i<1001; i++) {
			
			SqGenerator sq = SqGenerator.getInstance();
			String secNum = sq.secureRandom();
			if(unique.add(secNum)) {
				System.out.println(secNum);
				
			}else {
				repeat.add(secNum);
			}
		}
		System.out.println(repeat.size());
		
	}

}
