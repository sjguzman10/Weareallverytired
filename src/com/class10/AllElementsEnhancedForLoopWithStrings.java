package com.class10;

public class AllElementsEnhancedForLoopWithStrings {

	public static void main(String[] args) {
		String [] name= {"Ahmad", "Alex", "Angelo", "Bryan", "Gul", "Korkmaz", "Stephanie", "Tolga"};
		
		
		System.out.println("USING FOR LOOP");
		for (int i=0; i<name.length; i++) {
			System.out.print(name[i]+" ");
		}
		
		System.out.println();
		System.out.println("------------------------");
		
		System.out.println("USING ENHANCED FOR LOOP");
		
		for (String n:name) {
			System.out.print(n + " ");
		}
		


	}

}
