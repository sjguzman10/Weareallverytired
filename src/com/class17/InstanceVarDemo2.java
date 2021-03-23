package com.class17;

public class InstanceVarDemo2 {
	
	String name="Steph";
	int age=31;
	void printInfo() {
		
		//if I am inside the same class and my method is not static 
		//I can use my variables directly 
		
		double salary=120000;
		System.out.println(salary);
		System.out.println(name +" " +age);
	}

}
