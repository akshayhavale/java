package com.example.streams;

import java.util.ArrayList;
import java.util.List;

public class Test {

	private static List<Employee> list = new ArrayList<>();

	public static void main(String[] args) {

	}

	private List<Employee> intialize() {

		Employee e1 = new Employee(1L, "Akshay Havale", "Java Developer", 50000.00);
		Employee e2 = new Employee(2L, "Mahesh Gowda", "Frontend Developer", 55000.00);
		Employee e3 = new Employee(3L, "Divya Adur", "Tester", 35000.00);
		Employee e4 = new Employee(4L, "Amulya Guggali", "Deveops", 37600.00);
		Employee e5 = new Employee(5L, "Swathi", "Devops-Admin", 31000.00);

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		return list;
	}

}
