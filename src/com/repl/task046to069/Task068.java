package com.repl.task046to069;

public class Task068 {

	public static void main(String[] args) { //PASSED
		/*
		 *  *For you to do:** 
		 * Write a program to print out the pattern: 
		 * **Expected output:**
		 * $$$$
		 * $  $
		 * $  $
		 * $$$$
		 */
		
		for (int i=1; i<=4; i++) {
			
			for (int j=1; j<=4; j++) {
				
				if (i==1 || i==4 || j==1 || j==4)
				
				System.out.print("$");
				
				else {System.out.print(" ");}
			}
			System.out.println();
		}

	}

}
