package com.class07;

import java.util.Scanner;

public class LotteryWithWhile {

	public static void main(String[] args) {
		
		/*
		 * We play lottery and we have a win number which is 17
		 * We need to keep asking a user to enter any number from 1 to 100
		 * UNTIL correct number is entered
		 */

		Scanner input=new Scanner (System.in);
		int num;
		int lottoNumber=17; 
		
		System.out.println("Please enter any number from 1 to 100 to win the lottery");
		num=input.nextInt();
		
		while (num!= lottoNumber) {
			
			System.out.println("Please enter any number from 1 to 100 to win the lottery");
			
			num=input.nextInt();
		}
		
		System.out.println("Congratulations you entered " +num + " which is a lucky winner");
	}

}
