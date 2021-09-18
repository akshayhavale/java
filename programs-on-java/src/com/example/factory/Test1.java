package com.example.factory;

import com.example.streams.dxc.Person;

public class Test1 {
	
	public static void main(String[] args) {
		
		Person p = null;
		
		try {
			p.work();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
