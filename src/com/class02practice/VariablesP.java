package com.class02practice;

public class VariablesP {

	public static void main(String[] args) {
		
		String firstName;   //REMEMBER WHEN CODING - String variable; then variable = BLANK
		firstName="Stephanie";
		String lastName;
		lastName="Guzman";
		String space=" ";
		String period=".";
		
		char gradeA='A';
		char gradeB='B';
		
		String city="Los Angeles";
		String state="California";
		
		String country="Mexico"; 
		
		String phonenumber;
		phonenumber="123-456-7890";
		
		System.out.println("My name is" +space +firstName +space +"and my last name is" +space +lastName +period);
		System.out.println("I am a" +space +gradeA +"/" +gradeB +space+ "student" +period);
		System.out.println("I live in" +space+city+"," +state+period);
		System.out.println("My" +space +lastName +space +"family lives in" +space +country +period);
		System.out.println("And my phone number is" +space +phonenumber);	
		
		city="London";
		state="England";
		country="United Kingdom";
		
		phonenumber="098-765-4321";
		
		System.out.println("My name is" +space +firstName +space +lastName +period);
		System.out.println("I want to move to" +space +city +"," +state +space +"located in the" +space +country +period);
		System.out.println("My new phone number is" +space +phonenumber);
		

	}

}
