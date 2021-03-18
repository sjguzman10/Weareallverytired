package com.class09;

public class NumbersSquare {

	public static void main(String[] args) {
		//PRINT 654321 
		
		//Key - focus on column incrementing or decrementing 
		
		
		for (int r=5; r>=1; r--) {
			
			for (int c=6; c>=1; c--) {
				
				System.out.print(c+" ");
			}
			System.out.println();
		}
		
		System.out.println("-----OR-----");
		
		for (int r=1; r<=5; r++) {
			
			for (int c=6; c>=1; c--) {
				
				System.out.print(c+ " "); //printing columns 
			}
			
		System.out.println();	
		}

	}

}
