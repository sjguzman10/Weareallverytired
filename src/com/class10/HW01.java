package com.class10;

public class HW01 {

	public static void main(String[] args) {
		/*
		 * Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.
		 */
		
		String [] cars=new String [6];
		cars [0]="Dodge";
		cars [1]="Chevy";
		cars [2]="Ford";
		cars [3]="Honda";
		cars [4]="Toyota";
		cars [5]="Nissan";
		
		for (int i=0; i<6; i++) {
			System.out.print(cars[i] + " ");
		}
		
		System.out.println();
		System.out.println("---------------------------------------------");
	
		
		for (String c:cars) {
			System.out.print(c + " ");
		}

	}

}
