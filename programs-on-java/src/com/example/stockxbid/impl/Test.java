package com.example.stockxbid.impl;

public class Test {
	
	public static void main(String [] args) {
		
		
		SequenceGenerator seq = (SequenceGenerator) SequenceGenerator.readResolve();
		System.out.println(seq.nextId());
	}

}
