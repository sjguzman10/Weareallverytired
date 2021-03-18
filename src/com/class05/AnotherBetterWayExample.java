package com.class05;

import java.util.Scanner;

public class AnotherBetterWayExample {

	public static void main(String[] args) {
		/*
		 * We have to calculate commission on sales
		 * Ask user to enter sale that he made 
		 * Based on sales we will calculate commission
		 * If sale less than 10 --> Commission is 0.
		 * If sale is between  10 to 100 --> commission is 10%
		 * If sale is between 101 to 500 --> commission is 20%
		 * If sale is between 501 to 1000 --> commission is 30%
		 * If more than 1000 --> commission is 50% 
		 */
		
		Scanner scan;
		double saleAmount, commission;
		
		scan=new Scanner (System.in);
		System.out.println("Please enter your daily sale amount.");
		
		saleAmount=scan.nextDouble();
		
		if (saleAmount<10) {
			commission=0;}
		else if (saleAmount>=10 && saleAmount<=100) {
			commission=saleAmount*0.10;}
		else if (saleAmount>=101 && saleAmount<=500) {
			commission=saleAmount*0.20;}
		else if (saleAmount>=501 && saleAmount<=1000) {
			commission=saleAmount*.30;}
		else {commission=saleAmount*.50;}
		
		System.out.println("Your daily commission is "+commission);
		
		//if commission is more than 500 --> you are an amazing seller 
		if (commission>500) {System.out.println("You are an amazing seller.");}
	}

}
