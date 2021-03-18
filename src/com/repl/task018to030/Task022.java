package com.repl.task018to030;

import java.util.Scanner;

public class Task022 {

	public static void main(String[] args) {
		/*
		 * Write a program to take user name, age and mobile number
		 * First Output: "Enter your name"
		 * Second Output: "Enter your mobile number" (please use xxx-xxx-xxxx format)
		 * Third Output: "Enter your age"
		 * EXAMPLE OUTPUT
		 * Enter your name
		 * Enter your mobile number
		 * Enter your age
		 * Your name is Weqas, your age is 45 and your mobile number is 123-456-7890
		 */
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter your name");
		
		String name=input.nextLine();
		
		System.out.println("Enter your mobile number");
		
		String mobile=input.nextLine();
		
		System.out.println("Enter your age");
		
		int age=input.nextInt();
		
		System.out.println("Your name is " +name + ", your age is " +age+ " and your mobile number is " +mobile);
		
	}

}
