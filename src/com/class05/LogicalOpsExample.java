package com.class05;

import java.util.Scanner;

public class LogicalOpsExample {

	public static void main(String[] args) {
		/*
		 * Ask user to enter age
		 * Based on the age we will define:
		 * 		If age is 1 to 2 --> You are a baby
		 * 		If age is 3 to 5 --> You are a bigger baby
		 * 		If age is 6 to 12 --> You are a kid
		 * 		If age is 13 to 19 --> You are a teenager
		 * 		If you are above 20--> You are an adult
		 */
		
		Scanner input;
		String name;
		int age;
		
		input=new Scanner(System.in);
		System.out.println("Please enter your name");
		name=input.next();
		
		System.out.println("Please enter your age");
		age=input.nextInt();
		
		if (age>=1 && age<=2) {System.out.println("You are a baby");}
		
		else if (age>=3 && age<=5) {System.out.println("You are a bigger baby");}
		
		else if (age>=6 && age<=12) {System.out.println("You are a kid");}
		
		else if (age>=13 && age<=19) {System.out.println("You are a teenager");}
		
		else if (age>=20) {System.out.println("You are an adult");}
	}

}
