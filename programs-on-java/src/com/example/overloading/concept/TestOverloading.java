package com.example.overloading.concept;

public class TestOverloading {
	
	public static void main(String args []) {
		
		
		HumanBeing grandFather = new GrandFather();
		
		grandFather.setAge(19);
		grandFather.setName("Akshay");
	//	grandFather.setGender("MEN");
		
//		String s  = grandFather.introduce(grandFather.getAge(), grandFather.getName(), grandFather.getGender());
	//	System.out.println(s);
		
		System.out.println(grandFather.sayHello("Akshay"));
		
	}

}
