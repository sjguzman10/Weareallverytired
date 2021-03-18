package com.repl.task046to069;

public class Task062 {

	public static void main(String[] args) { //PASSED
		/*
		 * **For you to do:** 
		 * Using for loop Print 1 to 10 Numbers except 5 and 6
		 * **Expected Output:**
		 * 1
		 * 2
		 * 3
		 * 4
		 * 7
		 * 8
		 * 9
		 * 10
		 */
		
		for (int i=1; i<=10; i++) {
			if (i!=5 && i!=6) {
				System.out.println(i);
			}
		}

	}

}
