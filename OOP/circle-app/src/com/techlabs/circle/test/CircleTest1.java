package com.techlabs.circle.test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import com.techlabs.circle.Circle;

public class CircleTest1 {
	public static void main(String args[]) {
		Circle[] circles = new Circle[2];
		System.out.println(circles[0]);

		System.out.println("circle names");
		showMethodName(Circle.class);

		System.out.println("Integer class ");
		showMethodName(Integer.class);
	
		System.out.println("Object class ");
		showMethodName(Object.class);
		
		showMethodName(CircleTest1.class);
		
		System.out.println(new Circle().calulateArea(3));

	}

	public static void showMethodName(Class reflectclass) {
		Method[] methodname = reflectclass.getDeclaredMethods();
		for (Method method : methodname) {
			System.out.println(method.getName());

		}

	}

}
