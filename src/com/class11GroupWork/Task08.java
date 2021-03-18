package com.class11GroupWork;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) { //Alex
		// Maximum and minimum number in the array?
		
		Scanner input=new Scanner (System.in); 
		System.out.println("Enter the size of the array");
		int size=input.nextInt();
		
		int array [] = new int [size];
		
		//Filling in the array with numbers
		for (int i=0; i<array.length; i++) {
			
			System.out.println("Enter " +(i+1)+ " number");
			int x=input.nextInt();
			array[i]=x;
		}
		
		int max=array[0];
		int min=array[0];
		
		//Finding max and minimum
		
		for (int i=0; i<array.length; i++) {
			if (array[i]>=max) {
				max=array[i];
			}
		}
		
		for (int i=0; i<array.length; i++) {
			
			if (array[i]<=min) {
				
				min=array[i];
			}
		}
		System.out.println("Maximum is "+max);
		System.out.println("Minimum is "+min);

	}

}
