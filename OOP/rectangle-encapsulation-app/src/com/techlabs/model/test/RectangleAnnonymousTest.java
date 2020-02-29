package com.techlabs.model.test;

import rectangle.techlabs.model.Rectangle;

public class RectangleAnnonymousTest {
	public static void main(String args[]) {
		System.out.println(new Rectangle().readHeight());
		System.out.println(new Rectangle().readWidth());
		new Rectangle().changeHeight(100);
		System.out.println(new Rectangle().readHeight());
		
		System.out.println("Value from printInfo : ");
		new Rectangle().changeHeight(100);
		new Rectangle().changeWidth(60);
		printInfo(new Rectangle());

	}

	public static void printInfo(Rectangle r) {

		// System.out.println("Rectangle " + r + "'s" + " Info : ");
		System.out.println(r.readHeight());
		System.out.println(r.readWidth());
		System.out.println(r.calculateArea());
	}

}
