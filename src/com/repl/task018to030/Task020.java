package com.repl.task018to030;

import java.util.Scanner;

public class Task020 {

	public static void main(String[] args) {
		/* Write a program that takes user's first name and last name and prints in console.
		 * Instruct the user to enter first name: "Please Enter First Name"  
		 * Capture the first name.
		 * Instruct the user to enter last name:"Please Enter Last Name"
		 * Capture last name.
		 * Print first name and last name.
		 */
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter first name");
		
		String firstName=input.next();
		
		System.out.println("Please enter last name");
		
		String lastName=input.next();
		
		System.out.println(firstName + " " +lastName);
		
		
	}

}
