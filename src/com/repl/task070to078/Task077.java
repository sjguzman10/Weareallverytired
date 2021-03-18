package com.repl.task070to078;

import java.util.Scanner;

public class Task077 {

	public static void main(String[] args) { //PASSED
		/*
		 * Create an array of integers that will store 5 elements taken from a user
		 * Don't print any prompt message for the user
		 * Then print out all the elements you have created in the first loop in reverse order. 
		 * **Example:** 
		 * Input: 1
		 * 2
		 * 3
		 * 4
		 * 5
		 * Output:
		 * 5
		 * 4
		 * 3
		 * 2
		 * 1
		 */
		
		Scanner input=new Scanner (System.in);
		int [] a=new int [5];
		
		
		for (int i=0; i<5; i++) {
			a[i]=input.nextInt();
		}
		
		for (int i=4; i>=0; i--) {
			System.out.println(a[i]);
		}
		
	}
}
