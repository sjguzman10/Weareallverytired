package com.class04;

public class NestedIf {

	public static void main(String[] args) {
		
		boolean morning=true;
		
		boolean classToday=false;
		
		//is it morning? --->Good morning 
			//if there is class: yes ---> hello classmates 
			// otherwise ---> hello my family 
		
		if (morning) {
			System.out.println("Let me check if I have class today");
			
			if (classToday) {System.out.println("Good morning my classmates.");}

			else {System.out.println("Good morning my family");}
		}
			System.out.println("---End of the code----");
			
		System.out.println("-------------------------------Example 2-----------------------");
			
		boolean anyAllergy=false;
		boolean pollenAllergy=false;
		
		if (anyAllergy) {
			System.out.println("Let's check which allergies you have.");
			if (pollenAllergy) {System.out.println("Do not get close to trees.");
			}
			else {System.out.println("Ok, I know you do not have any pollen allergies.");}
		}
		else {
			System.out.println("You are lucky not having any allergies.");
		}
	}

}
