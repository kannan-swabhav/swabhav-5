package com.techlabs.model;

public class Player {
	private int id;
	private int age;
	private String name;
	private String emailid;

	public Player(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;

	}
	public Player (int id , String name, String emailid) {
		this(id, name, 18);
		this.emailid = emailid;
		
	}

	public int getId() {
		return id;

	}

	public int getAge() {
		return age;

	}

	public String getName() {
		return name;
	}
	
	public String getEmaiId() {
		return emailid;
	}

	public Player whoIsElder(Player p1 , Player p2) {
		int age1 = p1.getAge();
		int age2 = p2.getAge();
		if (this.age > age1 && this.age > age2)
			return this ;
		if(age1 > age2)
			return p1;
		
		return p2;

		

	}
	
	

}
