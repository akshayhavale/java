package com.example.java.overriding;

public class Test {
	
	public static void main(String [] args) {
		
		Parent p = new Child();
		
		p.live();
		
		p.work();
		
		try {
			p.run();
			p.run1();
			p.run3();
			p.run5();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
