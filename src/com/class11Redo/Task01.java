package com.class11Redo;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		/*
		 * Create an array of double values using scanner 
		 * Calculate the sum of all stored elements in that array
		 */
		
		Scanner scan=new Scanner (System.in);
		double sum=0;
		
		System.out.println("Please enter the size of your array.");
		int size=scan.nextInt();

		double [] array=new double [size];
		
		//Calculating the sum using regular FOR LOOP -----------------------------
		for (int i=0; i<size; i++) {
			
			array[i]=scan.nextDouble();
			sum+=array[i];
			
		}
		
		System.out.println("The sum of " +size + " elements in your array is ="+ sum);
		
		System.out.println("---Calculating sum using ENHANCED FOR LOOP-----");
		
		sum=0;
		for (double a:array) {
			sum+=a;}
		System.out.println("The sum of your "+size + " elements is =" +sum);

	}

}
