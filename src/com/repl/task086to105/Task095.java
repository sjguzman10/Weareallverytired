package com.repl.task086to105;

import java.util.Scanner;

public class Task095 { //PASSED

	public static void main(String[] args) {
		/*
		 * Using Scanner class input string value. 
		 * Print out the following: "The first 3 letters of \_\_\_ is ___"
		 * For example, if the input is "banana", 
		 * your output should be: "The first 3 letters of banana is ban"
		 */
		
		Scanner scan=new Scanner (System.in);
		String input;
		input=scan.nextLine();
		
		System.out.println("The first three letters of " + input + " is " + input.substring(0,3));

	}

}
