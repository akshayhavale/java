package com.example.java.polymorphism;

public interface Interface2 {
	
	
	public default void defaultMethod(String str) {
		System.out.println("DEFAULT METHOD OF INTERFACE2"+" , AND THE STIRNG INPUT PROVIDED IS : "+str);
	}
	
	public default void defaultMethod() {
		System.out.println("DEFAULT METHOD OF INTERFACE2");
	}

}
