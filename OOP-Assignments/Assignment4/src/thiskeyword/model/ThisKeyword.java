package thiskeyword.model;

public class ThisKeyword {
	private String name;
	private int age;
	private int rollno;

	
	//distinguish between local variables and instance variables of class
	public ThisKeyword(String name, int age) {
		this.name = name;   // this used to point to instance variables of the class
		this.age = age ;   

	}
	
	//re-use a constructor 
	public ThisKeyword(String name , int age ,int rollno) {
		this(name, age);		
		this.rollno = rollno;
	}
	
	
	
	public String getName() {
		return name;
				
	}
	
	public int getAge() {
		return age;
	}
	
	public int getRollno() {
		return rollno;
	}
	

}
