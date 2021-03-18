package com.class04;

public class NestedIfLastExample {

	public static void main(String[] args) {
		/*
		 * To donate blood:
		 * You must be 18 and older, other wise you cannot.
		 * Your weight must be more than 110 lbs. Otherwise, you cannot donate blood.
		 */
		
		int age=18;
		int weight=120;
		
		if (age>=18) {System.out.println("Age met. You may be able to donate blood.");
			
			if (weight>=110) {System.out.println("Age and weight met. You can donate blood.");}
			else {System.out.println("However, weight requirement not met. You cannot donate blood.");}
		}
		else {System.out.println("You cannot donate blood.");}
	}

}
