package com.class02practice;

public class StringExampleP {

	public static void main(String[] args) {
		
		//String can be a combination of ANYTHING 
		String name;
		name="Stephanie";
		String greeting="Good Morning!"; 
		String phoneNumber="123-456-7890";
		String stringNumber="12";
		String space=" ";
		
		String letter="A";
		String letter2="A ";
		char oneLetter='A';
		
		//Hello, my name is Stephanie 
		
		System.out.println("Hello, my name is" +space +name);	
		
		//How are you Stephanie?
		
		System.out.println("How are you" +space +name +"?");
		
		int age=31;
		//I am 31 years old.
		
		System.out.println("I am"+space +age +space +"years old.");
		
		char grade='A';
		//Stephanie is an A student. 
		
		System.out.println(name +space +"is" +space +"an" +space +grade +space +"student");
		
		/*
		 * String concatenation operator +sign can be used when used when we attach 
		 * String to another String 
		 * string to another number 
		 * string to any character or boolean
		 */
		
		String carModel="Bronco";
		String carMake="Ford";
		int year=2021; 
		//I drive a 2021 Ford Bronco
		
		System.out.println("I drive a"+space +year +space +carMake +space +carModel);
		
		String computer="Macbook";
		int memory=250;
		
		//Stephanie has a Macbook with 250 GB memory.
		System.out.println(name +space +"has a" +space +computer +space +"with" +space +memory +space +"GB memory.");
		
		String combinedValue = year + " " + carMake +space +carModel; //2021 Ford Bronco 
		System.out.println(combinedValue);
		
		byte day=8;
		String month="February";
		
		String date=month+space+day+space+year;
		System.out.println(date);
	}

}
