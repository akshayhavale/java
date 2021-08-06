package com.example.overloading.concept;

public class Child extends Parent {

	@Override
	public void m1() {
		System.out.println("CHILD m1()");
	}
	
	public static void m2() {
		System.out.println("CHILD m2()");
	}
	
	@Override
	public int m3() {
		return 23;
	}

	public int m4() {
		return 13;
	}
}
