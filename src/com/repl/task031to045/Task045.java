package com.repl.task031to045;

import java.util.Scanner;

public class Task045 {

	public static void main(String[] args) { //PASSED
		/*
		 * Ask the user to enter any number from 1-7.
		 * Based on the number define the day of the week
		 * **Example Output:**
		 * Input a number between 1-7
		 * Friday
		 * **Example Output:**
		 * Input a number between 1-7
		 * Invalid
		 */
		
		Scanner scan=new Scanner (System.in);
		int num;
		String weekday;
		
		System.out.println("Input a number between 1-7");
		num=scan.nextInt();
		
		switch (num) {
		
		case 1:
			weekday="Monday";
			break;
			
		case 2:
			weekday="Tuesday";
			break;
			
		case 3:
			weekday="Wednesday";
			break;
			
		case 4:
			weekday="Thursday";
			break;
			
		case 5:
			weekday="Friday";
			break;
			
		case 6:
			weekday="Saturday";
			break;
			
		case 7:
			weekday="Sunday";
			break;
			
		default:
			weekday="Invalid";
		
		}
		
		System.out.println(weekday);

	}

}
