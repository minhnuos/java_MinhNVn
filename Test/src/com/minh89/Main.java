package com.minh89;

import com.minh89.model.Student;
import com.minh89.model.Teacher;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("Minh", "442 pvd");
		System.out.println(s.toString());
		s.addCourseGrade("toan", 2);
		s.addCourseGrade("li", 3);
		s.addCourseGrade("hoa", 4);
		s.addCourseGrade("van", 5);
		s.addCourseGrade("anh", 6);
		s.printGrades();
		System.out.println("diemtb " + s.getAverageGrade());
		Teacher t = new Teacher("Tien", "HN");
		t.toString();
		t.setCourse1("toan");
		t.setCourse2("hoa");
		System.out.println(t.getCourse1() + " " + t.getCourse2());
	}

}
