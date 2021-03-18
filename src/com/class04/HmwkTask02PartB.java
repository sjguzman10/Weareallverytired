package com.class04;

import java.util.Scanner;

public class HmwkTask02PartB {

	public static void main(String[] args) {
		/*
		 * Write a program to ask user to enter numbers of worked years and annual salary. 
		 * If user worked for more or equals to 5 years than user is eligible for the bonus, otherwise he is not. 
		 * Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.
		 */
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter the number of years worked.");
		
		int years=input.nextInt();
		
		System.out.println("You have worked " + years + " years.");
		
		if (years>=5) {System.out.println("You are eligible for a bonus.");
		
		System.out.println("Please enter your salary.");
		
		int salary=input.nextInt();
		
		System.out.println("You have worked " + years + " years and your salary is $" +salary + ".");
		
			if (salary>=50000) {System.out.println("Your bonus is $5,000.");}
			else {System.out.println("Your bonus is $3,000.");}
		}
		
		else {System.out.println("You are not eligible for a bonus. 5 years or more needed at company.");}

	}

}
