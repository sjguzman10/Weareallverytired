package com.class05Review;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask if user has a credit card or not. 
		 * If you user does not have a credit card then offer them. 
		 * If they do have one ask what is balance on the card? 
		 * If balance of the card is larger than 1000, tell them to pay off immediately.
		 * 		Otherwise you can tell them that they can spend more
		 * 
		 */
		
		String creditCard;
		double balance;
		Scanner scan;
		
		scan=new Scanner(System.in);
		System.out.println("Do you have a credit card?");
		creditCard=scan.next();
		
		if (creditCard.equalsIgnoreCase("yes")) {
			System.out.println("What is the balance on the cc?");
			
			balance=scan.nextDouble();
			
			if (balance>1000) {System.out.println("Pay off immediately.");}
			else {System.out.println("Spend more.");}
		}
		
		else {System.out.println("Would you like a credit card?");}

	}

}
