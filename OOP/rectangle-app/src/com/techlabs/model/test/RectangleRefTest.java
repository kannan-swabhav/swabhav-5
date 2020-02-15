package com.techlabs.model.test;

import com.techlabs.model.Rectangle;

public class RectangleRefTest {
	public static void main(String args[]) {

		Rectangle small = null;//expects an object
		System.out.println(small);
		small = new Rectangle();
		System.out.println(small);
		System.out.printf("Height is %d Width is %d Area is %d \n" ,small.height,small.width,small.calculateArea());
		small.height = 100000;
		small.width = 10;
		System.out.println("Area is :" + small.calculateArea());//violating encapsulation ,business rules

	}

}
