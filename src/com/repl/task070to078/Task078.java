package com.repl.task070to078;

import java.util.Scanner;

public class Task078 {

	public static void main(String[] args) { //PASSED
		/*
		 * *For you to do:**
		 * Create an int array of integers with a size of 5 and input values with Scanner. 
		 * Don't print prompt questions for a user.
		 * Using loop print out each element of the array that should look like the output below
		 * **Example:**
		 * Input:
		 * 1
		 * 2
		 * 3
		 * 4
		 * 5
		 * Output:
		 * 10
		 * 20
		 * 30
		 * 40
		 * 50
		 */
		
		Scanner input=new Scanner (System.in);
		int [] a=new int [5];
		
		for (int i=0; i<5; i++) {
			
			a[i]=input.nextInt();
		}
		
		for (int i=0; i<5; i++) {
			
			int result=a[i]*10;
			
			System.out.println(result);
		}

	}

}
