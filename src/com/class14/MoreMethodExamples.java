package com.class14;

public class MoreMethodExamples {
	
	/*
	 * Create a method that does not take any values 
	 * and always returns String Hi
	 */
	
	String print() {
		return "Hi";
	}
	
	/*
	 * Create a method that takes a number 
	 * and returns the double of that number
	 */
	
	double doubleTheValue(double input) {
		return input*2;
	}
	
	/*
	 * Create a method that takes a boolean as input
	 * if the value is true, print- take the umbrella
	 * and if the value is false 
	 * print- please go for a walk
	 */
	
	void isRaining(boolean isRain) {
		if (isRain) {
			System.out.println("Please take the umbrella");
		}
		else {
			System.out.println("Please go for a walk");
		}
	}
	
	/*
	 * Create a method that writes "batch 9 is great" 5 times
	 */
	
	void print5times() {
		for (int i=0; i<5; i++) {
			System.out.println("Batch 9 is great!");
		}
	}
	
	/*
	 * Create a method that takes 2 numbers as input 
	 * and return the greater number 
	 */
	
	double greaternum (double num1, double num2) {
		if (num1>num2) {
			return num1;
		}
		else {
			return num2;}
	}
	
	/*
	 * Create a method that takes a number
	 * If number is even, print even 
	 * If number is odd, print odd 
	 */
	
	void evenOrOdd (int num) {
		if (num %2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
			}
	}
	
	/*
	 * Write a method that takes an array and
	 * returns the sum of the elements that are present in the array 
	 */
	
	double returnArraySum(double [] arr) {
		double sum=0;
		for (double element : arr) {
			sum=sum+element;
		}
		return sum;
	}
	
	/* INTERVIEW QUESTIONS
	 * Write a method that returns true 
	 * if a string is a mirror of itself 
	 * aba yes
	 * bbb yes
	 * bba no 
	 */
	
	boolean isMirror(String str) {
		String newStr="";
		//REVERSE LOOPS
		//starting from last index to first index 
		for (int i=str.length()-1;i>=0; i--) {
			//printing index of every value and the value itself
			System.out.println(i+" "+ str.charAt(i));
			//String printed in reverse
			newStr+=str.charAt(i);
		}
		System.out.println(newStr);
		//now to check if Strings are mirrored 
		if (str.equals(newStr)) {
			return true;
		}
		else {
			return false;
		}
	}
}
