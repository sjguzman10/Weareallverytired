package com.repl.task046to069;

import java.util.Scanner;

public class Task065 {

	public static void main(String[] args) { //PASSED
		/*
		 * Given the following inputs:
		 * int x;
		 * Write a for loop that will print out a series of numbers starting at one less than x and ending at 0.
		 * Sample input/outputs:
		 * In: 7
		 * 6 5 4 3 2 1 0
		 * In: 12
		 * 11 10 9 8 7 6 5 4 3 2 1 0
		 * In: 20
		 * 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0
		 */
		
		int x; 
		Scanner input=new Scanner (System.in);
		
		x=input.nextInt();
		int y=x-1;
		
		for (int i=y; i>=0; i--) {
			
			System.out.print(i+" "); //for repl println NOT print as requirements
		}

	}

}
