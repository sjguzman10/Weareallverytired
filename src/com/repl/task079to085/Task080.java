package com.repl.task079to085;

public class Task080 { //PASSED

	public static void main(String[] args) {
		/*
		 * Write a program to double the values of every element in the array and print it out.
		 * **Example Output:**
		 * 2.8 4.0 6.6 4.0 
		 * 8.0 3.0 12.2 2.0 
		 * 2.4 6.2 8.0 3.2
		 */
		
		double[][] a = {
				{1.4,2.0,3.3,2},
				{4,1.5,6.1,1},
				{1.2,3.1,4,1.6}
			};
		
		for (double [] num:a) {
			
			for (double n:num) {
				
				double result=n*2;
				System.out.print(result+" ");
			}
			System.out.println();
		}
		

	}

}
