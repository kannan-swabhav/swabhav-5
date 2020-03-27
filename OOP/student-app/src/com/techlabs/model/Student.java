package com.techlabs.model;

public class Student {
	private double cgpa;
	private int id;
	private String name;
	private static int studentcount = 0;

	public Student(int id, String name, double cgpa) {
		this.id = id;
		this.name = checkName(name);
		this.cgpa = cgpa;
		studentcount ++ ;
	}

	public Student(int id, String name) {
		this(id, name, 7.0);
	}
	
	private String checkName(String name) {
		if(name != null)
			return name;
		return name = "unknown";
	}
	
	private double checkCgpa(double cgpa) {
		if (cgpa < 0)
			return 7.0;
		if(cgpa > 10)
			return 7.0;
		return cgpa;

	}
	
	public String getName() {
		return name;
		
	}
	
	public int getId() {
		return id;
		
	}
	
	public double getCgpa() {
		return cgpa;
	}
	
	public int getStudentCount() {
		return studentcount;
	}
	
	
}
