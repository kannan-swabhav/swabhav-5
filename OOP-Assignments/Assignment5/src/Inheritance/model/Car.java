package Inheritance.model;

public abstract class Car {
	 private int wheels ;
	 
	 public Car(int wheels) {
		 
	 }
	
	 public int getWheels() {
		 return wheels;
	 }
	 
	 public void makesNoise() {
		 System.out.println("Engine sound normal " );
	 }
}
