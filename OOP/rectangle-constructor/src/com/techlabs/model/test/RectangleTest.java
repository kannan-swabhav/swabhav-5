package com.techlabs.model.test;

import com.techlabs.model.Colors;
import com.techlabs.model.Rectangle;

public class RectangleTest {
	public static void main(String args[]) {

		Rectangle testcase1 = new Rectangle(0, 0, Colors.blue);
		displayInfo(testcase1);

		Rectangle testcase2 = new Rectangle(3, 5);
		displayInfo(testcase2);

		Rectangle testcase3 = new Rectangle(60, 30, Colors.green);
		displayInfo(testcase3);

		Rectangle testcase4 = new Rectangle(-9, -8, Colors.red);
		displayInfo(testcase4);

		Rectangle testcase5 = new Rectangle(80, 40, null);
		displayInfo(testcase5);
		
		 

	}

	public static void displayInfo(Rectangle testcase) {

		System.out.println("color is : " + testcase.getColor() + " height is :" + testcase.getHeight() + " Width is :"
				+ testcase.getWidth() + " Area is: " + testcase.calculateArea());
	}

}
