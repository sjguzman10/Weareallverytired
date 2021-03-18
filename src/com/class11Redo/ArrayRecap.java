package com.class11Redo;

import java.util.Scanner;

public class ArrayRecap {

	public static void main(String[] args) {
		//We want to create an array that will store elements from a user 
		
		Scanner scan=new Scanner (System.in);
		String []array;		
		System.out.println("How many elements you would like to store?");
		int size=scan.nextInt();		
		array=new String[size]; //THIS STEP IS KEY TO INITIALIZE MY ARRAY		
		for (int i=0; i<size; i++) {			
			System.out.println("Please enter a string");
			array[i]=scan.next();			
		}		
		System.out.println("Let's see what we have stored.");
		
		for (String a:array) {
			System.out.println(a);
		}
	}
}
