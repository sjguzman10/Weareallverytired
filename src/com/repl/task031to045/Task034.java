package com.repl.task031to045;

import java.util.Scanner;

public class Task034 {

	public static void main(String[] args) { //PASSED
		/*
		 * Write a program to find the largest number among three distinct numbers using nested if condition
		 * Please use Scanner class to take input from users
		 */
		
		Scanner input=new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.println("Enter 3 numbers");
		num1=input.nextInt();
		num2=input.nextInt();
		num3=input.nextInt();
		
		if (num1>num2) {
			if (num1>num3) 
		{System.out.println("The largest number is "+num1);}
		}
		if (num2>num1) {
			if (num2>num3) 
		{System.out.println("The largest number is " +num2);}
		}
		if (num3>num1) {
			if (num3>num2) 
		{System.out.println("The largest number is " +num3);}
		}
	}
}

