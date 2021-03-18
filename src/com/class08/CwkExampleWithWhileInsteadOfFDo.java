package com.class08;

import java.util.Scanner;

public class CwkExampleWithWhileInsteadOfFDo {

	public static void main(String[] args) {
		/*
		 * We need to make user pay for soda
		 * Keep asking user to pay until it enters 3
		 * 
		 * if user gives more than >3 ---> please give less money 
		 * if user gives less than >3 --> please give more money 
		 */
		
		Scanner input=new Scanner (System.in);
		int sodaCost=3;
		
		 {System.out.println("Please pay for your soda");}
		 sodaCost=input.nextInt();
		
		while (sodaCost!=3) {
			if (sodaCost<3) {System.out.println("Please give more money");}
			else if (sodaCost>3) {System.out.println("Please give less money");}
			sodaCost=input.nextInt(); //capturing MUST be inside closing bracket 
		}
			
			System.out.println("Thank you for your purchase");
	}

}
