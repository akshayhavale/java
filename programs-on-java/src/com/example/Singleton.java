package com.example;

public class Singleton {

	private static Singleton INSTANCE = null;

	private Singleton() {

	}

	public Singleton getInstance() {
		if (INSTANCE == null) {
			synchronized (Singleton.class) {
				if (INSTANCE == null) {
					INSTANCE = new Singleton();
				}
			}
		}
		return INSTANCE;
	}
	
	

}
