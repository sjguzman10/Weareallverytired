package com.class10;

public class AllElementsFromAnArray {

	public static void main(String[] args) {
		// To access all elements- we use loop 
		
		int [] numbers= {10, 14, 78, 5, 90, 76, 1, 8};
		
		//Printing in order appeared
		for (int i=0; i<numbers.length; i++) {
			
			System.out.print(numbers [i] + " ");
		}
		
		System.out.println();
		System.out.println("----In reverse---");
		
		//print in reverse ---> -1 is key in order to have i match your index
		
		for (int i=numbers.length-1; i>=0; i--) {
			
			System.out.print(numbers[i] + " ");
		}
		
		//printing EVEN NUMBERS inside an array
		
		for (int i=0; i<numbers.length; i++) {
			
			if (numbers[i]%2==0)
			
			System.out.print(numbers [i] + " ");
		}
		

	}

}
