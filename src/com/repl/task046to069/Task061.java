package com.repl.task046to069;

public class Task061 {

	public static void main(String[] args) { //PASSED 
		/*
		 * *For you to do:** 
		 * Write a program that uses for loop to prints multiplication of  number 3 from 1 to 10
		 * **Expected Output:**
		 * 3*1=3
		 * 3*2=6
		 * 3*3=9
		 * 3*4=12
		 * 3*5=15
		 * 3*6=18 
		 * 3*7=21
		 * 3*8=24
		 * 3*9=27
		 * 3*10=30
		 */
		
		
		int num=3;
		int mult;
		
		for (int i=1; i<=10; i++) {
			
			mult=num*i;
			System.out.println(num+"*"+i+"="+mult);
		}

	}

}
