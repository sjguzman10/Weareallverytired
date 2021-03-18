package com.class02;

public class OpCwkPracticeA {

	public static void main(String[] args) {
		//Write a program to add, sub, mult, and divide 2 decimal values. 
		//Your program should read "The __ of 2 numbers __ and __ is equal to __. 
		
		double num1=2.22;
		double num2=4.44;
		
		double sum=num1+num2;
		double sub=num2-num1;
		double mult=num1*num2;
		double div=num2/num1; 
		
		System.out.println("The sum of " +num1 +" and " +num2 + " is equal to " +sum);
		System.out.println("The difference of " +num2 + " and " +num1 +" is " +sub);
		System.out.println("Result of multiplying " +num1 +" and " +num2 +" equals " +mult);
		System.out.println("Result of dividing " +num2 +" by " +num1 + " equals " +div);
		

	}

}
