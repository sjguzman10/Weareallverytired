package com.repl.task031to045;

import java.util.Scanner;

public class Task032 {

	public static void main(String[] args) { //PASSED
		/*
		 * Ask the user to enter his/her gender "Please enter your gender: M or F" and their age "Please enter your age"
		 * You have 2 conditions:
		 * If age is above 25, then check if a user entered F then the output should be "Woman" otherwise it should say "Man"
		 * If age is below 25, then check if a user entered F then the output should be "Girl" otherwise it should say "Boy"
		 */
		
		Scanner scan=new Scanner(System.in);
		int age;
		String gender, result;
		
		System.out.println("Please enter your gender: M or F");
		gender=scan.nextLine();
		System.out.println("Please enter your age");
		age=scan.nextInt();
		
		if (age>25 && gender.equalsIgnoreCase("F")) {result="Woman";}
		else if (age<25 && gender.equalsIgnoreCase("F")) {result="Girl";}
		else if (age>25 && gender.equalsIgnoreCase("M")) {result="Man";}
		else {result="Boy";}
		System.out.println(result);

	}

}
