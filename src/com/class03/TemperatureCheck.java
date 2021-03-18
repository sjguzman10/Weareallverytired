package com.class03;

public class TemperatureCheck {

	public static void main(String[] args) {
		/*
		 * Create variable to store temperature. 
		 * Your program should check if temperature is below 32 
		 * Then it should print “Water will freeze with temperature __“, 
		 * otherwise “Water will NOT freeze with temperature __“.
		 */
		
		int temp=30;
		
		if (temp<32) {
			System.out.println("Water will freeze with temperature " +temp);
		} else {
			System.out.println("Water will NOT freeze with temperature " +temp);
		}
	
	double money=5;
	double $coke=3;
	//If money is equal to amount of coke, I will buy soda.
	
	if(money ==$coke) {
		System.out.println("I am buying soda.");
	} else {
		System.out.println("I need exact amount.");
	}
	
	System.out.println("--------");
	
	//If it snows then I will play in the snow. If it doesn't snow, I will ride my bike. 
	boolean snow=true;
	
	if (snow) {
		System.out.println("Yay, I will play in the snow.");
	}
	else {System.out.println("I am going to ride my bicycle.");
	}
	
	System.out.println("--------");
	
	boolean summer=true;
	if(summer) {
		System.out.println("I am going to Florida");
	}
	else {
		System.out.println("I will stay at home.");
	}
	}
	
}
