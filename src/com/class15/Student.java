package com.class15;

public class Student {
	
	//how we create the classes

	String name;
	int age;
	String studentID;
	String schoolName;
	
	void study() {
		
		System.out.println(name + " studies in " +schoolName);
	}
	
	void payTuition() {
		System.out.println(name + " pays the tuition");
	}
	
	int getStudentAge () {
		return age;
	}
	
}
