package com.repl.task031to045;

import java.util.Scanner;

public class Task037 {

	public static void main(String[] args) { //PASSED
		/*
		 * Take 2 boolean inputs from a user:
		 * "Are you thirsty?"
		 * "Are you sleepy?"
		 * If user is thirsty and not sleepy--> drink=water
		 * If user is thirsty and sleepy--> drink=coffee
		 * If user is not thirsty and sleepy --> drink=tea
		 * Otherwise drink="nothing"
		 * Output: Looks like you need to drink 
		 */
		
		boolean thirsty=true;
		boolean sleepy=true;
		Scanner input=new Scanner (System.in); 
		String drink;
		
		System.out.println("Are you thirsty? If yes, write true. If no write false.");
		thirsty=input.nextBoolean();
		System.out.println("Are you sleepy? If yes, write true. If no, write false.");
		sleepy=input.nextBoolean();
		
		if (thirsty && sleepy) {drink="coffee";}
		else if (thirsty && !sleepy) {drink="water";}
		else if (!thirsty && sleepy) {drink="tea";}
		else {drink="nothing";}
		
		System.out.println("Looks like you need to drink "+drink);
	}

}
