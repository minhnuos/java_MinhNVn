package com.minh89.model;

public class CourseTaken {

	private String courseName;
	
	private int grade;

	public int getGrade() {
		return grade;
	}

	public CourseTaken(String courseName, int grade) {
		super();
		this.courseName = courseName;
		this.grade = grade;
	}
	
	
	

	public String toString() {
		return "courseName: " + this.courseName + " grade: " + this.grade; 
	}
}
