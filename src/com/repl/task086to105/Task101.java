package com.repl.task086to105;

import java.util.Scanner;

public class Task101 {

	public static void main(String[] args) { //PASSED
		/*
		 * **For you to do:**
		 * Inputs:
		 * String word;
		 * Write a for loop that will print out every other letter in a String, starting with the first letter.  These letters should be printed all on one line with no space in between.
		 * Sample input/outputs
		 * In: hello
		 * hlo
		 * In: SSyynnttaaxxTTeecchhnnoollooggiieess
		 * SyntaxTechnologies
		 */
		
		Scanner inp=new Scanner (System.in);
		System.out.println("In:");
		String word=inp.nextLine();
		
		String newWord="";
		
		for (int i=0; i< word.length(); i+=2) {
			
			newWord+=word.charAt(i);
			
		}
		System.out.println(newWord);
	}

}
