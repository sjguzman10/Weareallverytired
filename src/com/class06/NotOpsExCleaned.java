package com.class06;

import java.util.Scanner;

public class NotOpsExCleaned {

	public static void main(String[] args) {
		
		double price, discount =0, finalPrice =0; //INITIALIZE DISCOUNT WITH 0
		String item;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Do we have a sale today?");
		
		boolean sale=scan.nextBoolean();
		
		if (!sale) {System.out.println("I am not going shopping");}
		
		else {
			System.out.println("Do you have the item?");
			item=scan.next();
			System.out.println("What is the price?");
			price=scan.nextDouble();
			
			if (price<10) {
				discount=price*0.05;
				finalPrice=price-discount;}
			else if (price>=10 && price<100) {
				discount=price*.10;
				finalPrice=price-discount;}
			else if (price>=100 && price<500) {
				discount=price*.20;
				finalPrice=price-discount;}
			else if (price>500) {
				discount=price*.30;
				finalPrice=price-discount;}
			
			finalPrice=price-discount;
			System.out.println("You are buying " +item + " with original price=" + price + " after discount " + discount + "your final price is " +finalPrice);
		}

	}

}
