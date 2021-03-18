package com.repl.task031to045;

import java.util.Scanner;

public class Task044 {

	public static void main(String[] args) { //PASSED
		/*
		 * Prompt user with questions: "Please enter your favorite car make"
		 * If user enters  BMW -->  carOrigin = "german car"
		 * If user enters  Toyota -->  carOrigin = " japanese car"
		 * If user enters  Maserati -->  carOrigin = "italian car"
		 * anything else besides those values --> carOrigin = "unknown" 
		 * The output of your program should be:
		 * "Your favorite car is ___"
		 */
		
		Scanner input=new Scanner(System.in);
		String carOrigin, carMake;
		
		System.out.println("Please enter your favorite car make");
		carMake=input.nextLine();
		
		switch (carMake) {
		
		case "BMW":
			carOrigin="german car";
			break;
			
		case "Toyota":
			carOrigin="japanese car";
			break;
			
		case "Maserati":
			carOrigin="italian car";
			break;
			
		default: 
			carOrigin="unknown";}
		
		System.out.println("Your favorite car is " +carOrigin);
	}

}
