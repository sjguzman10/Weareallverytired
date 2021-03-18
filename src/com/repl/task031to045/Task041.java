package com.repl.task031to045;

import java.util.Scanner;

public class Task041 {

	public static void main(String[] args) { //PASSED
		/*
		 * Write a program using the switch statement
		 * Let us consider the scenario regarding the born baby age
		 */
		
		Scanner input=new Scanner (System.in);
		String movement;
		int age;
		System.out.println("Enter the age of the Child");
		
		age=input.nextInt();
		
		switch (age) {
		case 1:
			movement="You can Crawl";
			break;
		
		case 2: 
			movement="You can Talk";
			break;
			
		case 3:
			movement="You can Dance";
			break;
			
		case 4:
			movement="You can get Trouble";
			break;
			
		default:
			movement="I don't know how old you are";}
		
		System.out.println(movement);

	}

}

//OUTPUT
//First Output: "Enter the age of the Child"
//case 1: if age is 1 print as "You can Crawl"
//case 2 : if age is 2 print as  "You can Talk"
//case 3: If age is 3 print as "You can Dance"
//case 4: if age is 4 print as "You can get Trouble"
//Other than this age (1-4) it should print "I don't know how old you are" 