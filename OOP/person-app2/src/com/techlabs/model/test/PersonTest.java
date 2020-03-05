package com.techlabs.model.test;

import com.techlabs.model.GenderType;
import com.techlabs.model.Person;

public class PersonTest {
	public static void main(String args[]) {
		
		Person p1 = new Person("jay", 20, GenderType.male, 167, 50);
		printInfo(p1);
		p1.doWorkout();
		printInfo(p1);
		p1.doEat();
		printInfo(p1);

		Person p2 = new Person(null,20 , GenderType.others, 170, 60);
		printInfo(p2);
		p2.doWorkout();
		printInfo(p2);
		p2.doEat();
		printInfo(p2);
		
		

		
		
	}

	public static void printInfo(Person p1) {
		System.out.println("Name is : " + p1.getName() + " Age is : " + p1.getAge() + " Gender is: " + p1.getGender()
				+ " Height is: " + p1.getHeight() + " Weight is :" + p1.getWeight() +" BMI is : " + p1.getBmi() + " Body type is : " + p1.getBodyType());

	}
}
