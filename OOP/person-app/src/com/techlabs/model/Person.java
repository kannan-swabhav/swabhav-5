package com.techlabs.model;

public class Person {
	private String name;
	private int age;
	private String gender;
	private float height;
	private float weight;

	public Person (String pname, int page , String pgender,float pheight, float pweight) {
		name = checkName(pname);
		age = checkParameter(page);
		gender = checkGender(pgender);
		height = checkParameter(pheight);
		weight = checkParameter(pweight);

	}

	public void doWorkout() {
		weight = weight - (0.02f * weight);

	}

	public void doEat() {
		weight = weight + (0.05f * height);
	}

	private float checkParameter(float parameter) {
		if (parameter < 1)
			return 1;
		return parameter;

	}
	
	private String checkName(String pname) {
		if(pname != null)
			return pname;
		return pname = "unknown";
	}
	
	private int checkParameter(int parameter) {
		if (parameter < 1)
			return 1;
		return parameter;

	}
	
	private String checkGender(String pgender) {
		
		pgender = checkNullCharacter(pgender);
		if(pgender.equals("male")||pgender.equals("female"))
		return  pgender;
		
		return "other";
	}
	
	private String checkNullCharacter(String pgender) {
		if(pgender!= null) {
			return pgender.toLowerCase();
		}
		return pgender="other";
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {

		return gender;
	}

	public float getWeight() {
		return weight;

	}

	public float getHeight() {
		return height;
	}

}
