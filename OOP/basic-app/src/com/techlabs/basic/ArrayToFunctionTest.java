package com.techlabs.basic;

public class ArrayToFunctionTest {
	public static void main(String[] args) {
		float[] cgpalist = { 8.3f, 9.06f, 8.7f };
		
		System.out.println(cgpalist);

		upgradeCgpaList(cgpalist);
		for (float upgradedcgpa : cgpalist) {
			System.out.println(upgradedcgpa);
		}

	}

	public static void upgradeCgpaList(float[] cgpalistarray) {
		int length = cgpalistarray.length, i;
		for (i = 0; i < length; i++) {
			cgpalistarray[i] = (float) (cgpalistarray[i] + cgpalistarray[i]*0.1) ; 
		}
		System.out.println(cgpalistarray);
		//return (cgpalist);

	}
}
 