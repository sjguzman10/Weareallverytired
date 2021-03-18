package com.class04;

import java.util.Scanner;

public class AnotherDemo {

	public static void main(String[] args) {
		/*
		 * Capture 2 numbers from a user and then we will compare them.
		 */
		// To start and remove future error of Scan!! for Windows: ctrl+shift+o
		
		Scanner input=new Scanner(System.in); //Memorize this line code 
		//next put variable
		
		System.out.println("Please enter first number.");
		int num1=input.nextInt();
		
		System.out.println("Please enter second number.");
		int num2=input.nextInt(); //Memorize this line code 
		
		if (num1>num2) {
			System.out.println(num1 + " is larger than " +num2);
		}
		else if (num1<num2) {System.out.println(num2 + " is larger than " + num1);
		}
		else {System.out.println(num1 + " is equals to " +num2);}		
	}

}
