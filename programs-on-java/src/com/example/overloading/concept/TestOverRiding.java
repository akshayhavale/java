package com.example.overloading.concept;

public class TestOverRiding {
	
	public static void main(String args []) {
		
		
		Parent p = new Child();
		
	
		/**
		 * Normal Override
		 */
		p.m1();
		
		/**
		 * static override
		 */
		
		p.m2();
		
		/**
		 * return type
		 */
		System.out.println(p.m3());
		
		
	}

}
