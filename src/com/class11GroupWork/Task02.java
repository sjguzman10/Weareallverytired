package com.class11GroupWork;

public class Task02 {

	public static void main(String[] args) { //Angelo 
		/*
		 * Create a 2D array or integer type where you will store 
		 * 		odd and even numbers in 3 rows and 4 columns.
		 * Develop a program which will identify/print the even numbers only.
		 */
		
		int [][] numbers= {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				}; 
		
		for (int[] row:numbers) {
			for (int n:row) {
				if (n%2==0) {
					System.out.println(n);
				}
			}
		}
	}

}
