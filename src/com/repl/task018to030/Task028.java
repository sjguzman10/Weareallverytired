package com.repl.task018to030;

import java.util.Scanner;

public class Task028 {

	public static void main(String[] args) {
		/*
		 * Write a program to take values of length and width from the user.
		 * Based on value define whether the shape is a square or rectangle.
		 */
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter length");
		int num1=input.nextInt();
		
		System.out.println("Enter width");
		int num2=input.nextInt();
		
		if (num1==num2) {System.out.println("Your shape is a square");}
		
		else {System.out.println("Your shape is a rectangle");}

	}

}
