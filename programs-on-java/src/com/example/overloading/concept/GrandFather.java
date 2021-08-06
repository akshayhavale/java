package com.example.overloading.concept;

public class GrandFather extends HumanBeing {

	private String gender;

	public void introduce(String gender) {

		System.out.println("I am Grand Father of age : " + super.getAge() + "  and name of : " + super.getName()
				+ "  of gender : " + gender);

	}

	@Override
	public void introduce(int age, String name) {

		super.setAge(age);
		super.setName(name);
		System.out.println("I am Grand Father of age : " + super.getAge() + "  and name of : " + super.getName());
		

	}

	public String introduce(int age, String name, String gender) {

		super.setAge(age);
		super.setName(name);
		String s = "I am Grand Father of age : " + super.getAge() + "  and name of : " + super.getName()
		+ "  of gender : " + gender;
		
		return s;
		

	}
	
	
	public String introduce(int age, String name, String gender, String g) {

		super.setAge(age);
		super.setName(name);
		String s = "I am Grand Father of age : " + super.getAge() + "  and name of : " + super.getName()
		+ "  of gender : " + gender;
		
		return s;
		

	}
	

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String sayHello(String name) {
		return "Hello "+name;
	}

}
