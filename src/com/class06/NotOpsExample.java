package com.class06;

import java.util.Scanner;

public class NotOpsExample {

	public static void main(String[] args) {
		/*
		 * we need to calculate final price after the discount 
		 * 
		 * we check if there is sale 
		 * if no sale --> I am not going shopping.
		 * If there is a sale --> 
		 * 			we will ask about the item 
		 * 			we will ask the price
		 * If price is less than 10 apply --> 5% discount 
		 * If price is between 10 and 100 --> 10% discount 
		 * If price is between 100 to 500 --> 20% discount
		 * If price is more than 500 --> 30% discount 
		 */
		
		Scanner input=new Scanner(System.in);
		double $price, discount, total; 
		
		System.out.println("Is there a sale?");
		
		String sale=input.next();
		
		if (!sale.equalsIgnoreCase("no")) {System.out.println("Let's go shopping. What will you like to buy?");
		
			String item=input.next();
		
			if (!item.equalsIgnoreCase("shirt")) {System.out.println("Check price for your item. How much does it cost?");
			
				$price=input.nextDouble();
				
				if ($price<10) {System.out.println("You get a 5% discount. Your total is " +($price - ($price*.05)));}
				
				if ($price>=10 && $price<100) {System.out.println("You get a 10% discount. Your total is " +($price - ($price*.10)));
				
				if ($price>=100 && $price<500) {System.out.println("You get a 20% discount. Your total is " +($price - ($price*.20)));
				
				if ($price>=500) {System.out.println("You get a 30% discount. Your total is " +($price - ($price*.30)));
				}
				}

				}
			}
		
			else {System.out.println("Shirt sale eneded. All other items on sale!");}
		}
		
		else {System.out.println("We are not going shopping.");}

	}

}
