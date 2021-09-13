package com.example;

public class StaticCheck {

	public static void main(String args[]) {

		Display d = new Display();
		d.display();

		d = new DisplayScreen();

		d.display();

		DisplayScreen d1 = new DisplayScreen();
		d1.display();

	}

}
