package com.repl.task070to078;

public class Task071 {

	public static void main(String[] args) { //PASSED
		/*
		 * *For you to do:** 
		 * Write a program that creates an array of integers that stores the following values: 45,78, 12,  67, 55, 89, 23, 77, 88
		 * Print only values that stored with even index including 0.
		 * **Output:**
		 * 45 12 55 23 88 
		 */
		
		int [] array=new int [9];
		array [0]= 45;
		array [1]=78;
		array [2]=12;
		array [3]=67;
		array [4]=55;
		array [5]=89;
		array [6]=23;
		array [7]=77;
		array [8]=88;
		
		System.out.println(array[0]+ " "+ array[2] +" "+ array[4]+" "+ array[6]+" "+ array[8]);
		
	}

}
