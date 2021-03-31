package com.class15;

public class SubStringDemo {

	public static void main(String[] args) {
		// How can I take subpar from this String?
		
		//Substring from index 5
		String var="Syntax is the best";
		System.out.println(var.substring(5));
		
		//Now with start and ending point in middle of string 
		String var1="Syntax is the best";
		System.out.println(var1.substring(7,9)); //prints right before last index 9 (will print 9-1=8)

	}

}
