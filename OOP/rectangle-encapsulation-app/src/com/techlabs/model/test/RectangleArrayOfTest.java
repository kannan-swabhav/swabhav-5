package com.techlabs.model.test;

import rectangle.techlabs.model.Rectangle;

public class RectangleArrayOfTest {
	public static void main(String args[]) {
		Rectangle[] rectangles = new Rectangle[3];
		System.out.println(rectangles[0]);

		rectangles[0] = new Rectangle();
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		rectangles[1] = r1;
		rectangles[2] = r2;
		r1.changeHeight(3);
		r1.changeWidth(4);

		printInfo(rectangles);

	}

	public static void printInfo(Rectangle[] rec) {
		for (Rectangle rectangle : rec) {
			/*
			 * System.out.println(rectangle.readWidth());
			 * System.out.println(rectangle.readHeight());
			 * System.out.println(rectangle.calculateArea());
			 */
			printInfo(rectangle);

		}

	}

	public static void printInfo(Rectangle r) {
		System.out.println(r.readWidth());
		System.out.println(r.readHeight());
		System.out.println(r.calculateArea());

	}

}