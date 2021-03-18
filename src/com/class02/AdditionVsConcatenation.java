package com.class02;

public class AdditionVsConcatenation {
//Concatenation = TO ATTACH
	public static void main(String[] args) {
	//MEMORIZE ABOVE line for all tasks - this is the main method  
		
		int num1=10;
		int num2=11;
		
		String str1="Hello";
		String str2="Hi";
		
		System.out.println(num1+num2+str1+str2); //21HelloHi
	
		System.out.println(num1+str1+num2+str2); //10Hello11Hi
		
		System.out.println(str1+str2+num1+num2); //HelloHi1011
		
		//a plus sign is NO loner recognized as addition when mixed with string if string comes first 
		//Coding LEFT to RIGHT 
		
		String result=str1+str2+(num1+num2); //HelloHi21
		String result2=str1+str2+(num1*3);//HelloHi30
		System.out.println(result);
		System.out.println(result2);
	}

}
