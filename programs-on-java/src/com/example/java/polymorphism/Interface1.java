package com.example.java.polymorphism;

public interface Interface1 {

	public static void staticMethodOfInteface1() {
		System.out.println("STATIC METHOD OF INTERFACE1");
	}
	
	public default void defaultMethodOfInteface1() {
		System.out.println("DEFAULT METHOD OF INTERFACE1");
	}
	
	public default void defaultMethod() {
		System.out.println("DEFAULT METHOD OF INTERFACE1");
	}
	
	
}

