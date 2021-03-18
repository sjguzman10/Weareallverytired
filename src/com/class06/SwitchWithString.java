package com.class06;

import java.util.Scanner;

public class SwitchWithString {

	public static void main(String[] args) {
		/* We need to identify favorite food
		 * We need to capture country from a user 
		 * Based on the country identify favorite food
		 */
		
		Scanner input;
		String country, food; 
		
		input=new Scanner (System.in);
		System.out.println("Please enter your country.");
		
		country=input.nextLine();
		
		switch(country) {
		
		case "USA":
			food="burger";
			break;
		
		case "Afghanistan":
			food="kebab";
			break;
		
		case "Vietnam":
			food="pho";
			break;
			
		case "Poland":
			food="pierogi";
			break;
			
		case "Kazakstan":
			food="horse";
			break;
			
		case "Indian":
			food="massala";
			break;
			
		case "Mexico":
			food="tacos";
			break;
			
		default:
			food="Unknown";}
			
			System.out.println("Your favorite food is " +food);
		}
}
