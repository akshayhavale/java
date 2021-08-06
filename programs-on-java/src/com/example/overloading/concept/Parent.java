package com.example.overloading.concept;

public class Parent {
	
	protected String name;
	
	public void m1() {
		System.out.println("PARENT m1()");
	}
	
	public static void m2() {
		System.out.println("PARENT m2()");
	}
	
	public int m3() {
		return 13;
	}
	
	public long m4() {
		return 13;
	}

}
