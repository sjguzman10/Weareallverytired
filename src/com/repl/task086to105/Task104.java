package com.repl.task086to105;

import java.util.Scanner;

public class Task104 { //NOT PASSED

	public static void main(String[] args) {
		/*
		 * **For you to do:** 
		 * Create an array of names that will hold 5 String elements.
		 * Names must be taking from a user.
		 * Print out the first three characters of each element of the array, one per line.  
		 * Note: every array element must be at least 3 characters long. 
		 * Input Example:
		 * John
		 * Jane
		 * Jimmy
		 * Mike
		 * Emily
		 * Expected Output:
		 * **Joh**
		 * **Jan**
		 * **Jim**
		 * **Mik**
		 * **Emi**
		 */
		
		Scanner input=new Scanner (System.in);
		String [] arr=new String [5];
			
		for (int i=0; i<5; i++) {
			
			arr[i]=input.nextLine();
		}
		for (String a:arr) {
			
			for (int i=0; i<a.length(); i++) {
	
			}
			
			System.out.println(a.substring(0, 3));
		}
		

	}

}
