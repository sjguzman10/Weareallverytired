package com.class07;

public class WhileVsDoWhile {

	public static void main(String[] args) {
		
		System.out.println("----------WHILE------------"); 
		//WHILE loop used in programming compare to do while
		int num=0;
		
		while (num<=5) {
			System.out.println(num);
			num++;
		}

		System.out.println("--------DO WHILE--------");
		
		int num1=6;
		
		do {
			
			System.out.println(num1);
			num1++;
		}
		while (num1<=5);
		
		/*
		 * While = first check then execute 
		 * Do = first execute then check 
		 * 
		 * 
		 * Even when condition is False - DO will execute AT LEAST ONCE
		 */
		
	}

}
