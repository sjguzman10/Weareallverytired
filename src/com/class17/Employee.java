package com.class17;

public class Employee {
	
	/*
	 * Create a class called Employee:
	 * Create 3 variables empID, salary and set the CEO to Sumair 
	 * Create two objects of the class Employee
	 * Set the value of eID, salary for each of the objects 
	 * Print out the eID, salary and CEO for each of the objects
	 */
	
	static int empID; 
	static int salary;
	static String CEO="Sumair";

	public static void main(String[] args) {
		
		Employee obj1=new Employee();
		empID=123;
		salary=95000;
		System.out.println(empID + " "+ salary +" " +CEO);
	
		Employee obj2=new Employee();
		empID=456;
		salary=120000;
		System.out.println(empID + " "+ salary +" " +CEO);

	}

}
