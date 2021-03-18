package com.class11GroupWork;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) { //Alex
		// Write a java program to check whether a given number is prime or not?
		
		Scanner input=new Scanner (System.in); 
		System.out.println("Enter a number");
		
		int num=input.nextInt();
		boolean isPrime=true;
		
		for (int i=2; i<num; i++) {
			
			if (num%i==0) {
				isPrime=false;
				break;
			}
			
		}
		
		if (isPrime) {
			System.out.println(num + " is a prime number");
		}
		else {System.out.println(num+ " is not a prime number");}

	}

}
