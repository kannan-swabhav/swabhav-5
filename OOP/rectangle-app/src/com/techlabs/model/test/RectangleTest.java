package com.techlabs.model.test;

import java.awt.geom.Area;

import com.techlabs.model.Rectangle;

public class RectangleTest {
	public static void main(String args[]) {
		Rectangle big = new Rectangle();
		Rectangle small = new Rectangle();

		small.height = 5;
		small.width = 10;
		big.height = 50;
		big.width = 100;
		
		System.out.println("Width :" + small.width + " Height :" + small.height);
		System.out.println("Area is :" + small.calculateArea());
		System.out.println("Width :" + big.width + "  Height :" + big.height);
		System.out.println("Area is :" + big.calculateArea());
	}

}
