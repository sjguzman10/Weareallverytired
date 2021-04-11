package com.class18;

public class Task03 {
	/*
	 * Create a method that will accept a String as a parameter
	 * and return a new String that consist only of vowels.
	 * Method should be available inside the class 
	 * only where it was declared and executed by calling its name.
	 */
	
	private static String vowelsOnly (String input) { //inside the class only where it was declared and executed by calling its name
		
		return input.replaceAll("[^a,e,i,o,u]", ""); //replace all method from String class 
		
	}
	
	public static void main (String [] args) {
		System.out.println(vowelsOnly("Stephanie")); //it can only access above because of static 
	}

}
