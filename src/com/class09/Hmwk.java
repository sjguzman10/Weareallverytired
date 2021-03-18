package com.class09;

public class Hmwk {

	public static void main(String[] args) {
		/*
		 * Print the following pattern:
		 * 55555
		 * 44444
		 * 33333
		 * 22222
		 * 11111 
		 * Print the following pattern:
		 * 7654321
		 * 7654321
		 * 7654321
		 * 7654321
		 * 7654321
		 */
		
		for (int r=5; r>=1; r--) {
			
			for (int c=1; c<=5; c++) {
				
				System.out.print(r + ""); 
			}		
			System.out.println();
		}	
		System.out.println("-------------------");
		
		for (int r=5; r>=1; r--) {
			
			for (int c=7; c>=1; c--) {
				
				System.out.print(c + "");
			}
			System.out.println();
	
		}
	}
}
