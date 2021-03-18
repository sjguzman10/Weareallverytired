package com.class02;

public class StringExample {

	public static void main(String[] args) {
	
		String name; 
		name="Stephanie"; 
	
		String greeting="Good Morning!";
		String phoneNumber="123-456-7890";
		
		String stringNumber="12"; //quotes are needed in String when it comes to numerical values
		
		String space=" ";
		
		String letter="A"; //string value of A - double quote 
		char oneLetter='A'; //char value of A - single quote 
		
		//Hello, my name is Stephanie 
		
		System.out.println("Hello, my name is " +name); //attaching a variable 
		
		//How are you Stephanie? 
		System.out.println("How are you "+name); //add space and then close quote here 
		
		int age=31;
		//I am 31
		
		System.out.println("I am "+age); 
		
		char grade='A'; 
		//Chris is an A student 
		
		System.out.println(name +" is an "+grade+" student.");
		
		/*
		 * String concatenation operator + can be used when 
		 * we attach String to another String
		 * we attach String to a number 
		 * we attach String to any character or boolean
		 */
				
		String car="Tesla";
		int year=2021;
		
		//I drive 2021 Tesla
		
		System.out.println("I drive "+year+" "+car);
		
		String computer="macbook";
		int memory=250;
		
		//Stephanie has macbook with 250GB memory 
		
		System.out.println(name+" has " +computer +" with " +memory +"GB memory."); 
		
		String combinedValue=year+" "+car; //2021 Tesla - creating a combined values 
		
		System.out.println(combinedValue);
		
		byte day=7; 
		String month="February "; 
		
		String date=month+day;
		
		System.out.println(date); 
				
	}

}
