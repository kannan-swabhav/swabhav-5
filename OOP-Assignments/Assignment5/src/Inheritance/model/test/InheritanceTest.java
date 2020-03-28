package Inheritance.model.test;

import Inheritance.model.Car;
import Inheritance.model.Ford;

public class InheritanceTest {
	public static void main (String args []) {
		Car c1 = new Car();
		System.out.println(c1.getWheels());
		c1.makesNoise();		
		
		Ford f1 = new Ford();
		System.out.println(f1.getWheels() + " " + f1.getbrand() + " " + f1.getModelNo() );
		f1.makesNoise();
	}

}
