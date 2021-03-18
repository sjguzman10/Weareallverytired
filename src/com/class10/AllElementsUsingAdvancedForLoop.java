package com.class10;

public class AllElementsUsingAdvancedForLoop {

	public static void main(String[] args) {
		
		//for each, enhanced for loop, advanced for loop
		//USE ONLY WITH ARRAY OR COLLECTIONS!! 
		
		int [] numbers= {10, 14, 78, 5, 90};
		
		//Doing right to left:
		//Take each element, store it in the variable && specify which type
		
		for (int num:numbers) {
			System.out.print(num+" ");
		}
	
	}

}
