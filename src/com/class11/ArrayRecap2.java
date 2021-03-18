package com.class11;

import java.util.Scanner;

public class ArrayRecap2 {

	public static void main(String[] args) {
		//Store a list of groceries 
		
		Scanner scan;
		String [] array;
		
		scan=new Scanner (System.in);
		System.out.println("How many elements would you like to store?");
		
		int size=scan.nextInt();
		
		array=new String [size];
		
		for (int i=0; i<size; i++) {
			System.out.println("Please enter a string");
			array[i]=scan.next(); 
		}
		System.out.println("Let's see what we stored.......");
		
		for (String str:array) {
			
			System.out.print(str+" ");
		}
	}
}
