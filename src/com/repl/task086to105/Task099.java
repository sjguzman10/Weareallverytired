package com.repl.task086to105;

import java.util.Scanner;

public class Task099 { //NOT FINISHED 

	public static void main(String[] args) {
		/*
		 * Write code that will take in a String input and check to see if it is a palindrome or not.
		 * A palindrome means that the characters are the same forwards and backwards, **ignoring spaces.**
		 * Examples of palindromes:
		 * - racecar
		 * - was it a car or a cat I saw
		 * - never odd or even
		 * - rats live on no evil star
		 * Your check should be case insensitive too.  For example, "Bob" is a palindrome, despite the first B being capitalized.
		 * Your program will print out "true" if it's a palindrome and "false" if not.
		 */
		
		Scanner inp=new Scanner (System.in);
		System.out.println("In: ");
		String givenString=inp.nextLine(); }
	

		boolean isMirror(String givenString) {
			String newStr="";
			for (int i=givenString.length()-1; i>=0; i--) {
				newStr+=givenString.charAt(i);
			}
			if (givenString.equals(newStr)) {
				return true;
			}
			else {
				return false;
			}
		}
			public static void main2 (String [] args) {
			Task099 task099=new Task099(); 
			System.out.println(task099.isMirror());
		}
}




