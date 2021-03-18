package com.repl.task070to078;

import java.util.Scanner;

import java.util.Arrays;

public class Task076 {

	public static void main(String[] args) { //PASSED
		/*
		 * **For you to do:**
		 * Write a program that creates a String array with size 7. 
		 * Ask the user to input Days of a week beginning with Sunday using Scanner class.
		 * Add these inputs to your array and then print all values from that array
		 * Example:
		 * Please enter day 1 of the week
		 * Sunday
		 * Please enter day 2 of the week
		 * Monday
		 * Please enter day 3 of the week
		 * Tuesday etc
		 * **Example Output:**
		 * Please enter day 1 of the week
		 * Sunday
		 * Please enter day 2 of the week
		 * Monday
		 * Please enter day 3 of the week
		 * Tuesday
		 * Please enter day 4 of the week
		 * Wednesday
		 * Please enter day 5 of the week
		 * Thursday
		 * Please enter day 6 of the week
		 * Friday
		 * Please enter day 7 of the week
		 * Saturday
		 * ---
		 * Sunday
		 * Monday
		 * Tuesday
		 * Wednesday
		 * Thursday
		 * Friday
		 * Saturday
		 */
		
		Scanner input=new Scanner (System.in);
		String day;
		
		for (int i=1; i<=7; i++) {
		System.out.println("Please enter day " +i +" of the week");
		day=input.nextLine();
		}
		String weekday [] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
		for (String w:weekday) {
		System.out.println(w);}
		
	}

}
