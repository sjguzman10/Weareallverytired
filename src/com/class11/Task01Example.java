package com.class11;

import java.util.Scanner;

public class Task01Example {

	public static void main(String[] args) {
		/*
		 * Create an array on double values using scanner 
		 * Calculate the sum of all stored elements
		 */
		
		double sum=0;
		Scanner input=new Scanner (System.in);
		
		System.out.println("Please enter the size of the array");
		int size=input.nextInt();
		double [] a=new double [size];
		
		for (int i=0; i<size; i++) {
			a[i]=input.nextDouble();
			sum+=a[i]; //TO get sum of array 
		}
		
		System.out.println("The sum of "+size+ " elements from an array = " +sum);
		
		sum=0;
		
		for (double num:a) {
			
			sum+=num; //enhanced loop calls all numbers so just sum 
		}

	}

}
