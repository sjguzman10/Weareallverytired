package com.repl.task079to085;

public class Task083 {

	public static void main(String[] args) { //PASSED
		/*
		 * Write a program that calculates the sum of elements from each row in a 2D array and adds them into array of integers
		 * For example, if we run rowSums for the following 2D array:
		 * {
		 *   {1,1,2}, //sum = 4
		 *   {3,1,2}, //sum = 6
		 *   {3,5,3}, //sum = 11
		 *   {0,1,2}  //sum = 3
		 *   }
		 *   Then we should get the following array back:
		 *   4
		 *   6
		 *   11
		 *   3
		 */
		
		int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};
		
		int sum=a[0][0]+a[0][1]+a[0][2];
		System.out.println(sum);
		
		int sum1=a[1][0]+a[1][1]+a[1][2];
		System.out.println(sum1);
		
		int sum2=a[2][0]+a[2][1]+a[2][2];
		System.out.println(sum2);
		
		int sum3=a[3][0]+a[3][1]+a[3][2];
		System.out.println(sum3);
	}
}	
	
