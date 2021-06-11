package com.minh89.model;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{

	private List<CourseTaken> courses = new ArrayList<CourseTaken>();
	private int numberCourse;
	
	public Student(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}

	public void addCourseGrade(String course, int grade) {
		this.courses.add(new CourseTaken(course, grade));
	}
	
	public void printGrades() {
		for (CourseTaken courseTaken : this.courses) {
			System.out.println(courseTaken.toString());
		}
	}
	
	public double getAverageGrade() {
		double averageGrade = 0;
		for (CourseTaken courseTaken : this.courses) {
			averageGrade += courseTaken.getGrade();
		}
		averageGrade /= this.courses.size();
		return averageGrade;
		
	}
	
	
}
