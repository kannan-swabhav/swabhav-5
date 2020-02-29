package com.techlabs.circle.test;

import com.techlabs.circle.Circle;

public class CircleTest {
	public static void main(String args[]) {
		Circle[] circles = new Circle[5];
		circles[0] = new Circle();
		circles[1] = new Circle();
		circles[2] = new Circle();
		circles[3] = new Circle();
		circles[4] = new Circle();

		circles[0].setRadius(5);
		circles[1].setRadius(10);
		circles[2].setRadius(2.5f);
		circles[3].setRadius(3);
		circles[4].setRadius(6);

		printInfo(circles);
		printInfo(findLargestCircle(circles));
		printInfo(findSmallestCircle(circles));

	}

	public static void printInfo(Circle[] cir) {
		for (Circle circle : cir) {
			/*
			 * System.out.println(rectangle.readWidth());
			 * System.out.println(rectangle.readHeight());
			 * System.out.println(rectangle.calculateArea());
			 */
			printInfo(circle);

		}

	}

	public static void printInfo(Circle r) {
		System.out.println("Circle " + r + "Info :");
		System.out.println(r.getRadius());
		System.out.println(r.calulateArea(r.getRadius()));
		System.out.println(r.calculatePerimeter(r.getRadius()));

	}

	

	public static Circle findLargestCircle(Circle[] circles) {
		Circle big = circles[0];
		int length = circles.length;
		float radius ;
		for (int i = 0; i <length; i++) {
			radius = big.getRadius();
			if (radius < circles[i].getRadius()) {
				big = circles[i];
			}
		}
		return big;
	}

	public static Circle findSmallestCircle(Circle[] circles) {
		Circle small = circles[0];
		float radius ;
		for (int i = 0; i < 5; i++) {
			radius = small.getRadius();
			if (radius > circles[i].getRadius()) {
				small = circles[i];
			}
		}
		return small;
	}

}