package com.class02;

public class Variables {

	public static void main(String[] args) {
		
		String name;
		name="Stephanie";
		
		String lastName;
		lastName="Guzman";
		
		char grade='A';
		char gradeB='B';
		
		String city;
		city="Los Angeles";
		
		String state;
		state="CA";
		
		String phonenumber;
		phonenumber="123-456-7890";
		
		System.out.println("My name is " +name+" and my last name is "+lastName);
		
		System.out.println("I am "+grade+ "/"+gradeB+ " student");
		
		System.out.println("I live in " +city+ " and state of " +state);
		
		System.out.println("My new phone number is " +phonenumber);
		
		city="Chicago";
		state="IL";
		phonenumber="098-76-54321";
		
		System.out.println("My name is " +name+ " and I moved to new city of " +city+ " and new state of " +state+ ".");
		System.out.println("My new phone number is " +phonenumber); 
				
	}

}
