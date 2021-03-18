package com.class09;

public class PatternsNumbersTask {

	public static void main(String[] args) {
		/*
		 * OUTPUT
		 * 11111
		 * 22222
		 * 33333
		 * 44444
		 * 55555
		 */
		
		for (int r=1; r<=5; r++) {
			
			for (int c=1; c<=5; c++) {
				
				System.out.print(r + " "); //printing rows only 
			}
			System.out.println();
		}
	}

}
