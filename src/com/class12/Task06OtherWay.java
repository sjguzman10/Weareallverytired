package com.class12;

public class Task06OtherWay {

	public static void main(String[] args) {
		// Write a java program to check whether a given number is prime or not?
		
		int num=17;
		boolean prime=true;
		
		if (num>1) {
		for (int i=2; i<num; i++) {
			
			if (num %i==0) { //if 0 remainder, number is divisible by another number
				prime=false;
				break;
				
			}
		}
		if (prime) {
		System.out.println(num + " is a prime numbers");}
		else {
			System.out.println(num + " is NOT a prime number ");
		}

	}
		
		else {System.out.println("Number is invalid.");}
		
	}

}
