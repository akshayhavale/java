package com.example.generics;

public class GenericsTest {

	public static void main(String[] args) {
		MyGenerics<String, Integer, Long> stringGeneric = new MyGenerics<>();
		stringGeneric.setObject1("Akshay");
		stringGeneric.setObject2(100);
		stringGeneric.setObject3(200L);
		System.out.println(stringGeneric.getObject1());
		System.out.println(stringGeneric.getObject2());
		System.out.println(stringGeneric.getObject3());

		/**
		 * Generic and FunctionalInterface test
		 */
		GenericInterface1<Double, Double> tester = new Generic1Impl<>();
		System.out.println(tester.apply(100.0, 23.3));
	}

}
