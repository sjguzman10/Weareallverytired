package com.repl.task018to030;

import java.util.Scanner;

public class Task023 {

	public static void main(String[] args) {
		/*
		 * Create a program that will ask a user to input boolean value "Input the boolean value".
		 * If the input is true or false, then the output should look like below:
		 * EXPECTED OUTPUT:
		 * Input the boolean value
		 * The value is false OR The value is true
		 */
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Input the boolean value");
		
		boolean quest=input.nextBoolean();
		
			if (quest) {System.out.println("The value is true");}
			
			else {System.out.println("The value is false");}

	}

}
