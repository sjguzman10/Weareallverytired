package com.class09;

public class PatternsStarTask {

	public static void main(String[] args) {
		/*
		 * Triangle OUTPUT
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		
		for (int r=1; r<=5; r++) {
			
			for (int c=1; c<=r; c++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----Reverse triangle----");
		
		for (int r=1; r<=5; r++) {
			
			for (int c=5; c>=r; c--) {
				
				System.out.print("*");
				
			}
			
		System.out.println();
		}

	}

}
