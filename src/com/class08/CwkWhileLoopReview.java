package com.class08;

import java.util.Scanner;

public class CwkWhileLoopReview {

	public static void main(String[] args) {
		/*
		 * We need to make user pay for soda
		 * Keep asking user to pay until it enters 3
		 * 
		 * if user gives more than >3 ---> please give less money 
		 * if user gives less than >3 --> please give more money 
		 */
		
		Scanner input=new Scanner (System.in);
		int num;
		int sodaCost=3;
		
		do {
		System.out.println("Please pay for your soda.");
		num=input.nextInt();
			if (num>3) {System.out.println("Please give less money");}
			else if (num<3)	System.out.println("Please give more money");
		}
		while (num!=sodaCost); 
			System.out.println("You can have soda now. Enjoy!");

	}

}
