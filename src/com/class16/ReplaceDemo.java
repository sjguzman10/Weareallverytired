package com.class16;

public class ReplaceDemo {

	public static void main(String[] args) {
		// Replace come of the variables from the String
		//old char with new char 
		
		String var1="Hello";
		var1=var1.replace('e','a'); //we can replace characters
		System.out.println(var1);
		String var2="Syntax is best. Batch 9 is best"; //we can replace words/Strings 
		System.out.println(var2.replace("best", "amazing"));

	}

}
