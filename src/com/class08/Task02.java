package com.class08;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		// Create a program that will keep asking user to apply for a credit card. 
		//As soon you get “yes” from a user program should stop asking.
		
		Scanner input=new Scanner (System.in);
		String card; 
		boolean yes=true;
		
				
		while (yes) {
			System.out.println("Do you want a credit card?");
			card=input.nextLine();
			
			if (card.equalsIgnoreCase("yes")) {
				System.out.println("Stop asking if they want credit card.");
				break;
			} 
		}
	}
}
