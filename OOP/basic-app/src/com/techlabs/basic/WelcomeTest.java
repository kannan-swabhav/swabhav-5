package com.techlabs.basic;

import java.awt.SystemColor;
import java.util.Arrays;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class WelcomeTest {
	public static void main(String[] args) {

		System.out.println("hello");
		System.out.println(0);
		System.out.println(2.33);
		System.out.println(" hey");
		System.out.println();

		printInfo("2");

		String str = "http//swabhavtechlabs.com?developerispawan&roleisarchitect";
		String[] SplitStr = str.split("http//|.com\\?developeris|&roleis");

		for (String a : SplitStr) {
			System.out.println(a);
		}

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

	public static void printInfo(char a) {
		System.out.println(a);
	}

	public static void printInfo(Double a) {
		System.out.println(a);
	}

}
