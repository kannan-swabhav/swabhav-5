package com.techlabs.model.test;

import com.techlabs.model.Player;

public class PlayerTest {
	public static void main(String args[]) {
		Player sachin = new Player(2, "Sachin", 16);
		printInfo(sachin);

		Player virat = new Player(2, "Virat", 20);
		printInfo(virat);

		Player dhoni = new Player(3, "dhoni", "xyz@gmai.com");//18
		printInfo(dhoni);

		Player temp = sachin.whoIsElder(virat, dhoni);
		printInfo(sachin, virat, dhoni, temp);
	}

	public static void printInfo(Player p) {
		System.out.println("Name is:" + p.getName() + " Age is: " + p.getAge() + " id is : " + p.getId()
				+ " email id : " + p.getEmaiId());

	}
	
	public static void printInfo(Player p1 , Player p2 , Player p3 , Player temp) {
		String name = temp.getName();
		if (name == p1.getName()) {
			System.out.println( name + " is greater then " + p2.getName()+" and " + p3.getName());
		}
		
		if (name == p2.getName()) {
			System.out.println( name + " is greater then " + p1.getName()+" and " + p3.getName());
		}
		
		if (name == p3.getName()) {
			System.out.println( name + " is greater then " + p1.getName() +" and " + p2.getName());
		}
		
	}
	
	
	
	
}
