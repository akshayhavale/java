package com.example.streams.employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamsEmployee {

	public static void main(String[] args) {

		List<Employee> employees = initialize();

		/**
		 * Sorting
		 */

		// Sort Based on id

		System.out.println("*******Id based Sort*****");

		List<Employee> idSort = employees.stream().sorted(Comparator.comparing(Employee::getId))
				.collect(Collectors.toList());
		idSort.stream().forEach(System.out::println);

		System.out.println("*************************");

		System.out.println("*******Id based Sort and reverseOrder*****");

		List<Employee> idSortReverse = employees.stream().sorted(Comparator.comparing(Employee::getId).reversed())
				.collect(Collectors.toList());
		idSortReverse.stream().forEach(System.out::println);

		System.out.println("*************************");

		System.out.println("*******Collect employess between 50000 to 70000 salaried employees*****");

		SalaryTaxAdder sal = (Double salary) -> {
			Double tax = 233.0;
			return salary + tax;
		};

		List<Employee> salariedEmployees = employees.stream()
				.sorted(Comparator.comparing(Employee::getSalary).reversed())
				.filter(emp -> emp.getSalary() >= 50000.0 && emp.getSalary() <= 70000).map(emp -> {
					emp.setSalary(sal.taxCalulate(emp.getSalary()));
					return emp;
				}).collect(Collectors.toList());
		salariedEmployees.stream().forEach(System.out::println);

		System.out.println("*************************");
		
		
		System.out.println("*******Collect employess between 50000 to 70000 salaried employees in that 2nd highest salary taker *****");

		

		Employee secHighSalaryEmp = employees.stream()
				.sorted(Comparator.comparing(Employee::getSalary).reversed())
				.filter(emp -> emp.getSalary() >= 50000.0 && emp.getSalary() <= 70000).map(emp -> {
					emp.setSalary(sal.taxCalulate(emp.getSalary()));
					return emp;
				}).limit(2).collect(Collectors.toList()).get(1);
		
		System.out.println(secHighSalaryEmp);

		System.out.println("*************************");

	}

	private static List<Employee> initialize() {

		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("E1");
		e1.setSalary(100000.00);
		Employee e2 = new Employee();
		e2.setId(2);
		e2.setName("E2");
		e2.setSalary(90000.00);
		Employee e3 = new Employee();
		e3.setId(3);
		e3.setName("E3");
		e3.setSalary(80000.00);
		Employee e4 = new Employee();
		e4.setId(4);
		e4.setName("E4");
		e4.setSalary(70000.00);
		Employee e5 = new Employee();
		e5.setId(5);
		e5.setName("E5");
		e5.setSalary(60000.00);
		Employee e6 = new Employee();
		e6.setId(6);
		e6.setName("E6");
		e6.setSalary(50000.00);
		Employee e7 = new Employee();
		e7.setId(7);
		e7.setName("E7");
		e7.setSalary(40000.00);
		Employee e8 = new Employee();
		e8.setId(8);
		e8.setName("E8");
		e8.setSalary(30000.00);
		Employee e9 = new Employee();
		e9.setId(9);
		e9.setName("E9");
		e9.setSalary(20000.00);
		Employee e10 = new Employee();
		e10.setId(10);
		e10.setName("E10");
		e10.setSalary(10000.00);

		List<Employee> list = Arrays.asList(e3, e1, e2, e7, e4, e8, e5, e10, e6, e9);
		return list;

	}

}
