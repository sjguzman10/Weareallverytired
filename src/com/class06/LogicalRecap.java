package com.class06;

import java.util.Scanner;

public class LogicalRecap {

	public static void main(String[] args) {
		/*
		 * We need to get the time 
		 * Based on time, we need to identify what time of the day it is 
		 * If time is between 1 to 11 --> morning 
		 * If time is between 12 to 13 --> noon
		 * If time is between 14 to 17 --> afternoon 
		 * If time is between 18 to 21 --> evening 
		 * If time is between 22 to 24 --> night 
		 */
		
		Scanner scan; 
		int time; 
		String timeOfDay = "Invalid"; //null, invalid etc is needed when you are not writing else
		
		scan=new Scanner(System.in);
		System.out.println("Please enter time in 24 hour format.");
		time=scan.nextInt();
		
		if (time>=1 && time<=11) {timeOfDay="Morning";}
		else if (time>=12 && time<=13) {timeOfDay="Noon";}
		else if (time>=14 && time<=17) {timeOfDay="Afternoon";}
		else if (time>=18 && time<=21) {timeOfDay="Evening";}
		else if (time>=22 && time<=24) {timeOfDay="Night";}
	
		
		System.out.println("Based on the entered time, time of the day is " +timeOfDay);
		
		/*
		 * compiler can initialize variables to their default values:
		 * default value of int --> 0
		 * default value of double --> 0.0
		 * default value of boolean --> true 
		 * default value of String and all non primitives --> null 
		 */
		
		
	}

}
