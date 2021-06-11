package com.minh89.model;

public class Teacher extends Person{

	private String course1;
	
	private String course2;
	
	public Teacher(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}

	public String getCourse1() {
		return course1;
	}

	public void setCourse1(String course1) {
		this.course1 = course1;
	}

	public String getCourse2() {
		return course2;
	}

	public void setCourse2(String course2) {
		this.course2 = course2;
	}
	
	

}
