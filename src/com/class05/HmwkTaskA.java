package com.class05;

import java.util.Scanner;

public class HmwkTaskA {

	public static void main(String[] args) {
		/*
		 * Write a program for user to enter his/hers birth month. Based on the month define the season.
		 * Example: if user is born in June, July or August ; season =“Summer”.
		 * At the end of the program we should see output as “You were born is season ______“.
		 */
		
		Scanner input;
		String month,season=null;
		
		System.out.println("Please enter your birth month.");
		input=new Scanner(System.in);
		
		month=input.nextLine();
		
		if ((month.equalsIgnoreCase("January")) || (month.equalsIgnoreCase("February")) || (month.equalsIgnoreCase("December")) )
				{season="Winter";}
		
		else if ((month.equalsIgnoreCase("March")) || (month.equalsIgnoreCase("April")) || (month.equalsIgnoreCase("May"))  )
				{season="Spring";}
		
		else if ((month.equalsIgnoreCase("June")) || (month.equalsIgnoreCase("July")) || (month.equalsIgnoreCase("August"))  )
				{season="Summer";}
		
		else if ((month.equalsIgnoreCase("September")) || (month.equalsIgnoreCase("October")) || (month.equalsIgnoreCase("November")) )
				{season="Fall";}
		
		System.out.println("You were born in " +season);
	}

}
