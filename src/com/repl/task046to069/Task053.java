package com.repl.task046to069;

public class Task053 {

	public static void main(String[] args) { //PASSED
		/*
		 * *For you to do:** 
		 * Using do while loop print even numbers from 20 to 1
		 * **Expected Output:**
		 * 20
		 * 18
		 * 16
		 * 14
		 * 12
		 * 10
		 * 8
		 * 6
		 * 4
		 * 2
		 */
		
		int num=20;
		do {
			System.out.println(num);
			num-=2;
		}
		while (num>1);
	}

}
