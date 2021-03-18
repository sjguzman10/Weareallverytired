package com.class04;

import java.util.Scanner;

public class HmwkTask01PartC {

	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask user to input city and temperature. 
		 * Your program should convert Fahrenheit into celsius.
		 * Print “The temperature in the city __ is __”
		 */
		
		String city;	
		System.out.println("Please enter your city.");
		Scanner scan=new Scanner (System.in);
		city=scan.nextLine();
		System.out.println("The city you entered is " +city); 
		
		System.out.println("Please enter " +city +" temperature in Fahrenheit degrees.");
	
		double temp=scan.nextDouble();
		
		double celsius=(temp-32)*5/9;
		
		System.out.println("The temperature in the city " +city + " is " + temp + " in Fahrenheit and " + celsius + " in Celsius.");
		
		
		
	}

}
