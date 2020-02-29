package com.techlabs.model.test;

import rectangle.techlabs.model.Rectangle;

public class RectanglePrintTest {
	public static void main (String args[]) {
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		
		r1.changeHeight(10);
		r1.changeWidth(15);
	
		r2.changeHeight(5);
		r2.changeWidth(4);
		
		System.out.println("Rectangle r1's Info :");
		printInfo(r1);
		
		System.out.println("Rectangle r2's Info :");
		printInfo(r2);
		
		
		
	}
	
	public static void printInfo(Rectangle r ) {
		
		//System.out.println("Rectangle " + r + "'s" + " Info : ");
		System.out.println(r.readHeight());
		System.out.println(r.readWidth());
		System.out.println(r.calculateArea());
	}

}
