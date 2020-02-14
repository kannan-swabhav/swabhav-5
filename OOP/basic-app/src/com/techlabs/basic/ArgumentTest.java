package com.techlabs.basic;

public class ArgumentTest {
	public static void main (String []names) {
		int arraysize ;
		arraysize = names.length;
		System.out.println(arraysize);
		for (String name : names) {
			System.out.println(name);
		}
		String []namescopy = names ;
		/*for (String name : namescopy) {
			System.out.println(name);
		}*/
		
		names [0]= " this value changed" ;
		for (String name : namescopy) {
			System.out.println(name);
		}
		
		System.out.println(names );
		System.out.println(namescopy);
		
		 
	}

}
