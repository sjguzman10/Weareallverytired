package com.repl.task079to085;

public class Task079 { //PASSED

	public static void main(String[] args) {
		/*
		 * **For you to do:**
		 * Write a program to print values from a 2D array
		 * **Example Output:**
		 * 1.4 2.0 3.3 2.0 
		 * 4.0 1.5 6.1 1.0 
		 * 1.2 3.1 4.0 1.6 
		 */
		
		double [][] array= {
				{1.4, 2.0, 3.3, 2.0},
				{4.0, 1.5, 6.1, 1.0},
				{1.2, 3.1, 4.0, 1.6}
		};
		
		for (double[] arr:array) {
			
			for (double num:arr) {
				System.out.print(num + " ");
			}
			System.out.println();
		}

	}

}
