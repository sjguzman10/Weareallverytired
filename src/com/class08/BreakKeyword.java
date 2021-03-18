package com.class08;

public class BreakKeyword {

	public static void main(String[] args) {
		
		boolean rain=true;
		int temp=40;
		
		while (rain) {
			System.out.println("I will stay at home");
			
				if (temp>75) {System.out.println("I will walk under warm rain");}
				break; //breaks loop from infinity
	
		// WONT PRINT HERE- Code unreached out of loop
			//System.out.println("I am code inside while loop");
				
		}
		
		System.out.println("---------");
		
		for (int i=1; i<=10; i++) {
			System.out.println("Hello");
			
			if (i==5) {
				break;
			}
			System.out.println("I am inside the loop");
		}

	}

}
