package com.techlabs.basic;

public class OverloadingTest {
	public static void main(String[] args) {

		System.out.println("hello");
		System.out.println(0);
		System.out.println(2.33);
		System.out.println(" hey");
		System.out.println(1 > 2);
		
		PrintInfo("hello");

	}

	private static void PrintInfo(String a) {
		System.out.println(a);
	}

	private static void printInfo(float a) {
		System.out.println(a);
	}

	private static void printInfo(int a) {
		System.out.println(a);
	}

	private static void PrintInfo(char a) {
		System.out.println(a);
	}

	private static void PrintInfo(Double a) {
		System.out.println(a);
	}

}
