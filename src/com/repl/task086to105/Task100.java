package com.repl.task086to105;

import java.util.Scanner;

public class Task100 { //PASSED

	public static void main(String[] args) {
		/*
		 * String s;
		 * Write a for loop that will print out the reverse of the string.
		 * Sample input/outputs:
		 * In: manhattan
		 * nattahnam
		 * In: processor
		 * rossecorp
		 * In: racecar
		 * racecar
		 */
		
		Scanner inp=new Scanner (System.in);
		System.out.println("In:");
		String s=inp.nextLine();
		
		String newS="";
		for (int i=s.length()-1; i>=0; i--) {
			
			newS+=s.charAt(i);
		}
		System.out.println(newS);

	}

}
