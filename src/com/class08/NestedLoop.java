package com.class08;

public class NestedLoop {

	public static void main(String[] args) {
	
		
		for (int i=1; i<3; i++) { 		//OUTER loop
			
			System.out.println("I am your outer loop.");
			
			
			for (int j=1; j>=3; j++) {	//INNER loop
				
				
				System.out.println("I am your inner loop.");
			}
		}

	}

}
