package com.example.overloading.concept;

public abstract class HumanBeing {

	private int age;
	private String name;

	public void introduce(int age, String name) {

		this.age = age;
		this.name = name;

		System.out.println("I am Human Being of age : " + age + "  and name of : " + name);

	}
	
	public abstract String sayHello(String name);

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
