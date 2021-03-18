package com.class07;

import java.util.Scanner;

public class DoOrWhile {

	public static void main(String[] args) {
		/*
		 * We play lottery and we have a win number which is 17
		 * We need to keep asking a user to enter any number from 1 to 100
		 * UNTIL correct number is entered
		 */
		
		Scanner input=new Scanner (System.in);
		int num;
		int lottoNumber=17; 
		
		//Use DO since we enter number first, then check num; NOT check num and then enter
		do { 
		System.out.println("Please enter any number from 1 to 100 to win the lottery");
		num=input.nextInt();
		}
		while (num!=lottoNumber); //when using (num==lottoNumber) will not work and not keep checking, code gets stuck
		//code needs to stop at 17 so use num!= like above
		System.out.println("Congratulations! You entered " +num + " which is a lucky number");
	}

}
