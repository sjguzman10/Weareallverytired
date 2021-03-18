package com.class08;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		//Write a program that reads a range of integers (start and end point), provided by a user 
		//       and then from that range prints the sum of the even and odd integers.
		
		Scanner input=new Scanner (System.in);
		int start,end;
		int sumOdd=0;
		int sumEven=0;
		
		System.out.println("You will input a range of numbers. Please enter a starting number.");
		start=input.nextInt();
		System.out.println("Please enter your end point number.");
		end=input.nextInt();
		
		for (int i=start; i<=end; i++) {
			if (i%2!=0) {
				sumOdd+=i;
			}
			else {
				sumEven+=i;
			}
			
		}
		System.out.println("Sum of odd numbers from range " +start + " to "+end + " is = " +sumOdd);
		System.out.println("Sum of even numbers from range "+start+ " to " +end + " is = "+sumEven);
		

	}

}
