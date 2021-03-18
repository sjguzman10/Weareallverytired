package com.class08;

public class HmwkReview {

	public static void main(String[] args) {
		//CLEAN CODE HMWK 
		int odd=0;
		int even=0;
		
		for (int i=1; i<=50; i++) {
			if (i%2==0) {
				even+=i;
			}
			else {odd+=i;}
			
		}
		
		System.out.println("Sum of odd numbers equals to " +odd);
		System.out.println("Sum off even numbers equals to "+even);
	}

}
