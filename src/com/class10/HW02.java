package com.class10;

public class HW02 {

	public static void main(String[] args) {
		/*
		 * Create an array of animals and store 6 elements into it. Using 2 different loops print all elements from the array.
		 */
		
		String [] animals=new String [6];
		
		animals [0]="Dog";
		animals [1]="Cat";
		animals [2]="Elephant";
		animals [3]="Duck";
		animals [4]="Bee";
		animals [5]="Monkey";
		
		for (int i=0; i<6; i++) {
			
			System.out.print(animals[i]+ " ");
		}
		
		System.out.println();
		System.out.println("-------------------------------------");
		
		for (String a:animals) {
			System.out.print(a+" ");
		}

	}

}
