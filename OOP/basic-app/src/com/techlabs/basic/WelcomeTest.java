package com.techlabs.basic;

import java.awt.SystemColor;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class WelcomeTest {
	public static void main(String[] args) {

		System.out.println("hello");
		System.out.println(0);
		System.out.println(2.33);
		System.out.println(" hey");
		System.out.println();

		printInfo("2");

	}

	public static void printInfo(String a) {
		System.out.println(a);
	}
	
	public static void printInfo(float a) {
		System.out.println(a);
	}
	
	public static void printInfo(int a) {
		System.out.println(a);
	}

}
