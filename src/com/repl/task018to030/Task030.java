package com.repl.task018to030;

import java.util.Scanner;

public class Task030 {

	public static void main(String[] args) {
		/*
		 * Write a program to take the month number from a user.
		 * Provide month name to the corresponding month number.
		 * If a user provides any number that is out of month range, the program should display "Invalid"
		 * IMPORTANT: use Scanner Class
		 * OUTPUT EXAMPLE:
		 * Please enter month number 1
		 * January
		 * OR 
		 * Please enter month number 33 
		 * Invalid
		 */
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter month number");
		
		int num=input.nextInt();
		
		if (num==1) {System.out.println("January");}
		
		else if (num==2) {System.out.println("February");}
		
		else if (num==3) {System.out.println("March");}
		
		else if (num==4) {System.out.println("April");}
		
		else if (num==5) {System.out.println("May");}
		
		else if (num==6) {System.out.println("June");}
		
		else if (num==7) {System.out.println("July");}
		
		else if (num==8) {System.out.println("August");}
		
		else if (num==9) {System.out.println("September");}
		
		else if (num==10) {System.out.println("October");}
		
		else if (num==11) {System.out.println("November");}
		
		else if (num==12) {System.out.println("December");}
		
		else {System.out.println("Invalid");}
	}

}

