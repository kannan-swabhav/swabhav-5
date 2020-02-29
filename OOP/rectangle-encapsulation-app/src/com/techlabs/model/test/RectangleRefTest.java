package com.techlabs.model.test;

import rectangle.techlabs.model.Rectangle;

public class RectangleRefTest {
	public static void main (String args[]) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 ;
		r2 = r1 ;
		
		r2.changeHeight(r2.readHeight() + 1);
		r2.changeWidth(r2.readWidth() + 1);
		
		System.out.println(r1.readHeight());
		System.out.println(r1.readWidth());
		
		System.out.println(r2.readHeight());
		System.out.println(r2.readWidth());
	}

}
