package com.example.java.overriding;

import java.sql.SQLException;

public class Child extends Parent{
	
	public void live() {
		System.out.println("CHILD IS LIVING LIFE");
	}
	
	public void work() {
		System.out.println("CHILD IS WORKING IN LIFE");
	}

	public void run(){
		System.out.println("CHILD RUN() METHOD");
	}
	
	public void run1() throws ArithmeticException{
		System.out.println("CHILD RUN() METHOD");
	}
	/*
	public void run2() throws Exception{
		System.out.println("CHILD RUN() METHOD");
	}
	*/
	/*
	public void run3() throws Exception{
		System.out.println("CHILD RUN() METHOD");
	}
	*/
	public void run3() throws ArithmeticException{
		System.out.println("CHILD RUN() METHOD");
	}
	/*
	public void run4() throws SQLException{
		System.out.println("CHILD RUN() METHOD");
	}
	*/
	
	public void run5() throws SQLException{
		System.out.println("CHILD RUN() METHOD");
	}
}
