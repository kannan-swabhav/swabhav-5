package com.techlabs.model;


public class Person {
	private String name;
	private int age;
	private GenderType gender;
	private float height;
	private float weight;
	private String bodytype;
	private float bmi;

	public Person(String pname, int page, GenderType pgender, float pheightincm, float pweightinkg) {
		name = checkName(pname);
		age = checkParameter(page);
		gender = pgender;
		height = checkParameter(pheightincm);
		weight = checkParameter(pweightinkg);
		bmi = caluculateBmi();
		bodytype = validateBodyType();

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
		if (pname != null)
			return pname;
		return pname = "unknown";
	}

	private int checkParameter(int parameter) {
		if (parameter < 1)
			return 1;
		return parameter;

	}

	private float convertMetertoCentimeter() {

		float cm = height / 100;
		return cm;

	}

	private float caluculateBmi() {
		float height = convertMetertoCentimeter();
		float weight = getWeight();
		float bmi = weight / (height * height);

		return bmi;
	}

	private String validateBodyType() {
		String pbodytype = " ";
		pbodytype = evaluateBodyTypeUnderweight(pbodytype);
		if (pbodytype.equals("Underweight")) {
			return pbodytype;
		}
		return pbodytype = evaluateBodyTypeNormalAndOverWeight(pbodytype);

	}

	private String evaluateBodyTypeUnderweight(String pbodytype) {
		if (bmi < 18) {
			return pbodytype = "Underweight";
		}

		return pbodytype;

	}

	private String evaluateBodyTypeNormalAndOverWeight(String pbodytype) {
		if (bmi <= 25) {
			return pbodytype = "Normal";
		}
		return pbodytype = "Overweight";

	}

	/*
	 * private String checkGender(String pgender) {
	 * 
	 * pgender = checkNullCharacter(pgender);
	 * if(pgender.equals("male")||pgender.equals("female")) return pgender;
	 * 
	 * return "other"; }
	 */

	private String checkNullCharacter(String pgender) {
		if (pgender != null) {
			return pgender.toLowerCase();
		}
		return pgender = "other";
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public GenderType getGender() {

		return gender;
	}

	public float getWeight() {
		return weight;

	}

	public float getHeight() {
		return height;
	}

	public float getBmi() {
		return bmi;
	}

	public String getBodyType() {
		return bodytype;
	}

}
