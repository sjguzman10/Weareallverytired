package com.class04;

public class HmwkTask02PartA {

	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask if user has a credit card or not. 
		 * If you user does not have a credit card then offer them. 
		 * If they do have one ask what is balance on the card? 
		 * If balance of the card is larger than 1000, tell them to pay off immediately.
		 * 		Otherwise you can tell them that they can spend more.
		 */
		
		boolean creditUser=true;
		boolean bal=true;
		int balance=200;
		
		if (creditUser) {System.out.println("User has a credit card.");
			if (bal) {System.out.println("User has a credit card balance.");
				if (balance>1000) {System.out.println("Pay off immediately.");}
				else {System.out.println("User can spend more.");}
			}
			else {System.out.println("User does not have a credit card balance.");}
		}
		else {System.out.println("Offer user credit card");};

	}

}
