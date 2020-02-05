package com.techlabs.basic;

public class StringArrayTest {
	public static void main(String args[]) {
		int i ;
		int length ;
		String name[] = { "vinit", "prasad", "jay", "pawan", "tejashree", "tanmay", "sejal", "murtaza", "pawan1" };
		System.out.println("This is traditional");
		for (i=0;i<=8;i++) {
			System.out.println("name is :" +name[i] );
			
		}
		System.out.println("This is by enhanced for loop");
		for (String a : name) {
			System.out.println(a);
		}
		System.out.println("Names with a ");
		for (String a : name) {
			if(a.contains("a")) 
			{
				a.replace("a", "o");
				System.out.println(a);
				
				
			
			}
		}
		
		//length = name.length();
	

	}
}