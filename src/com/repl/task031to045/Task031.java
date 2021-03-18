package com.repl.task031to045;

import java.util.Scanner;

public class Task031 {

	public static void main(String[] args) { //PASSED
		/*
		 * Declare boolean variable isSunny, ask the user "Is it sunny outside?"
		 * Declare int temperature and ask user "What is the temperature outside?"
		 * 
		 * Your program should check:
		 * 		If the weather is sunny output should be "It is a sunny day, I should go somewhere!"
		 * 		If it is not sunny output should be "I stay home and practice Java"
		 * If the weather is sunny you want to check the temperature "What is the temperature outside?"
		 * If the temperature is higher than 85 then "I am going to the beach"
		 * otherwise, "I am going to the park"
		 */
		
		boolean isSunny=true;
		int temp;
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Is it sunny outside?");
		isSunny=scan.nextBoolean();
		
		if (isSunny) {System.out.println("It is a sunny day, I should go somewhere!");
		System.out.println("What is the temperature outside?");
		temp=scan.nextInt();
			if (temp>85) {System.out.println("I am going to the beach");}
			else {System.out.println("I am going to the park");}
		}
		else {System.out.println("I should stay home and practice Java");}
	}

}
