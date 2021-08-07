package com.example.java.polymorphism;

public class TestInterfaces {
	
	public static void main(String [] args) {
		
		Interface1.staticMethodOfInteface1();
		
		ClassForInterfaceDefaultMethodCall cl = new ClassForInterfaceDefaultMethodCall();
		cl.defaultMethodOfInteface1();
		
		cl.defaultMethod();
		cl.defaultMethod("LOMBO");
		
		
		
	}

}
