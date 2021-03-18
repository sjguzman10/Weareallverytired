package com.repl.task046to069;

import java.util.Scanner;

public class Task063 { //PASSED

	public static void main(String[] args) {
		/*
		 * Given the following inputs:
		 * int x;
		 * Write a for loop that will print out a series of numbers starting at 0 and ending at the x(value must be taken from a user), exclusive.
		 * **Example Output:**
		 * In: 3
		 * 0 1 2
		 * In: 8
		 * 0 1 2 3 4 5 6 7
		 * In: 5
		 * 0 1 2 3 4
		 */
		
		int x;
		Scanner input=new Scanner (System.in);
		
		//DO NOT INCLUDE THIS ON PASSING System.out.println("Please enter a number.");
		x=input.nextInt();
		
		for (int i=0; i<x; i++) {
			
			System.out.println(i); //for RPL actual output wanted is println vs print 
		}
 
	}

}
