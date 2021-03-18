package com.repl.task031to045;

import java.util.Scanner;

public class Task033 {

	public static void main(String[] args) { //PASSED
		/*
		 * Ask the user to enter any number
		 * if a user enters a number and it is even, print "Value is even", otherwise print "Value is odd"
		 * If the number is even then check if it is greater than 1000 or not.
		 * If the number is greater than 1000, then print "Even value is large", else print "Even value is just right".
		 */
		

	     Scanner scan=new Scanner(System.in);
	     int num;
	     String value;

	     System.out.println("Please enter a number");
	     num=scan.nextInt();

	     if (num%2==0) {value="even";}
	     else {value="odd";}

	     System.out.println("Value is "+value);

	     if (num>1000 && num%2==0) {System.out.println("Even value is large");}
	     else if (num>1000 && num%2!=0) {System.out.println("Odd value is large");}
	     else if (num<1000 && num%2==0) {System.out.println("Even value is just right");}
	     else {System.out.println("Odd value is just right");}

	}

}
