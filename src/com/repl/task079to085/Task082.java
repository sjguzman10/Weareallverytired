package com.repl.task079to085;

public class Task082 {

	public static void main(String[] args) { //PASSED
		/*
		 * **For you to do:**
		 * Write a program that will print the sum of all elements in 2D array. 
		 * **Expected Output:**
		 * -9
		 */
		
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2, 2},
				{1,-2, 3,-4}
			};
		
		int sum=0;

		for (int [] num:a) {
			
			for (int n:num) {
				
				sum=sum+n;
			}
		}
		System.out.println(sum);
}
}
