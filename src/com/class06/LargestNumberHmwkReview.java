package com.class06;

import java.util.Scanner;

public class LargestNumberHmwkReview {

	public static void main(String[] args) {
		/*
		 * Write a program to find largest of three double values using nested if.
		 * if and logical operators provided by a user (numbers must be distinct)
		 */
		
		int num1, num2, num3, largest;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter 3 numbers");
		num1=input.nextInt();
		num2=input.nextInt();
		num3=input.nextInt();
		
		if (num1==num2 && num2==num3) {System.out.println("Numbers are equal.");}
		
		else {
		
		if (num1>num2) { //we assume number1 is bigger than 2 
			if (num1>num3) {largest=num1;}
			else {largest=num3;}
		}
		else {//assuming number 2 is larger than 1
			if (num2>num3) {largest=num2;}
			else {largest=num3;}
		}
		System.out.println("The largest number among " +num1 + " "+num2 +" "+ num3 +" is " +largest);
	}
}
}