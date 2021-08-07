package com.example.java.overriding;

import java.sql.SQLException;

public class Parent {
	
	public void live() {
		System.out.println("PARENT IS LIVING LIFE");
	}
	
	/**
	 * Access specifier is protected here and child class i am going to provide Narrow down access specifier as package 
	 * result :- i am expecting it throw error 
	 * 
	 * public -> protected -> package -> private
	 */
	protected void work() {
		System.out.println("PARENT IS WORKING IN LIFE");
	}
	
	/**
	 * 
	 * Now i want to test by EXCEPTION where checked exceptions and EXCEPTION hierarchy follows
	 * 1) PARENT throws EXCEPTION(TOP LEVEL) and CHILD wont throws anything = result = passed
	 * 2) PARENT throws EXCEPTION(TOP LEVEL) and CHILD throws unchecked exceptions low level arithmetic exception = result = passed
	 * 3) PARENT throws unchecked ArithmeticException (LOW LEVEL) and CHILD throws EXCEPTION HIGH level = result = failed
	 * 4) PARENT throws checked SQLException and CHILD throws EXCEPTION HIGH level = result = failed
	 * 5) PARENT throws checked SQLException and CHILD throws ArithmeticException = result = passed
	 * 6) PARENT throws unchecked ArithmeticException and CHILD throws checked SQLException = result = failed
	 * 7) PARENT throws Exception and CHILD throws checked SQLException = result = passed
	 * 8) PARENT throws NOTHING and CHILD throws unchecked ArithmeticException = result = passed
	 */
	public void run() throws Exception{
		System.out.println("PARENT RUN() METHOD");
	}

	public void run1() throws Exception{
		System.out.println("PARENT RUN() METHOD");
	}

	public void run2() throws ArithmeticException{
		System.out.println("PARENT RUN() METHOD");
	}
	
	public void run3() throws SQLException{
		System.out.println("PARENT RUN() METHOD");
	}
	
	public void run4() throws ArithmeticException{
		System.out.println("PARENT RUN() METHOD");
	}
	
	public void run5() throws Exception{
		System.out.println("PARENT RUN() METHOD");
	}
}
