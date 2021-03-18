package com.class12;

public class Task05OtherWay {

	public static void main(String[] args) {
		/*
		 * Write a program to swap 2 numbers without a temporary variable 
		 * //THIS WAS AN INTERVIEW Q 
		 */
		
		int x=100;
		int y=56;
		
		x= x+y;
		y=x-y;
		x=x-y; 
		
		System.out.println("After swapping x = " + x + ", y = " + y);

	}

}
