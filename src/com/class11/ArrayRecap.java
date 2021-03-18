package com.class11;

import java.util.Scanner;

public class ArrayRecap {

	public static void main(String[] args) {
		/*
		 * We want to create an array that will store elements from a user 
		 */
		
		Scanner scan;
		String [] array;
		
		scan=new Scanner (System.in);
		System.out.println("How many elements would you like to store?");
		
		//USER Input how many boxes to store 
		int size=scan.nextInt();
		
		//initialize and create array 
		array=new String [size];
		
		//one by one we create elements to store inside our array 
		for (int i=0; i<size; i++) { //because user tell you size, can use just i<size
									//user size.length when we do not know 
		//ask user to enter values 
			System.out.println("Please enter a string");
			//Now we store it 
			array[i]=scan.next();
		}
	}

}
