package com.class18;

public class Task02 {
	/*
	 * Create a method that will take a String as a parameter
	 * and returns reversed String.
	 * Method should be available to all classes within your project
	 * and accessible by class name. 
	 */
	
	//method should be available which means should be public 
	//accessible by class name means it should be static whoch allows me to use this method by not creating an object 
	
	public static String reverseString (String str) {
		
		String str2=""; 
		
		for (int i=str.length()-1; i >=0; i--) {
			str2+=str.charAt(i);
		}	
		return str2;
	}
}
