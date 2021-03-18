package com.class16;

public class ReplaceAllDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String var1="Syntax is best34343. Batch nine is great";
		System.out.println(var1.replaceAll("[0-9]", ""));
		var1="84923840298392384eajefaiwjnvanevuHJFKHASHGDAK";
		System.out.println(var1.replaceAll("[a-zA-Z]", "")); //a-z for lower case only
		var1="15614654646jfajdhfjahsdgjahdJIGHAIH&(&$(&*";
		//to only see lower case characters and replace with space 
		System.out.println(var1.replaceAll("[^a-z]"," "));
		//to see only numbers 
		System.out.println(var1.replaceAll("[^0-9]",""));
		
		
	}

}
