package com.repl.task018to030;

import java.util.Scanner;

public class Task029 {

	public static void main(String[] args) {
		/*
		 * Write a java program that prints out true if ( x y ) returns a positive value. 
		 * 						Else prints out false if (x y) returns a negative value.
		 * Step 1: Your program should ask "Please enter first number" - for the 1st number and 
		 * 			"Please enter second number" - for the 2nd number.
		 * Step 2: Create if condition to check if the multiplication of x and y values is positive or negative.
		 * If the result of a multiplication is positive print true, otherwise print false.
		 */
		
		Scanner input=new Scanner (System.in);
		
		System.out.println("Please enter first number");
		
		int num1=input.nextInt();
		
		System.out.println("Please enter second number");
		
		int num2=input.nextInt();
		
		if (num1*num2>=0) {System.out.println("true");}
		
		else {System.out.println("false");}

	}

}
