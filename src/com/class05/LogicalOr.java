package com.class05;

public class LogicalOr {

	public static void main(String[] args) {
		/* variable day 
		 * 
		 * if day is Tuesday or Wednesday -- > Manual Class 
		 * if day is Monday or Friday --> No Class
		 * if day is Saturday or Sunday --> Java Class
		 * if day is Thursday --> review class 
		 */
		
		String day="Thursday";
		
		if (day.equals("Monday")   ||   day.equals("Friday")) {System.out.println("Today I have no class.");}
		
		else if (day.equals("Tuesday")   || day.equals("Wednesday")) {System.out.println("Today I have Manual class.");}
		
		else if (day.equals("Thursday")) {System.out.println("Today I have Review class.");}
		
		else if (day.equals("Saturday")  ||    day.equals("Sunday")) {System.out.println("Today I have Java class.");}
		
		else {System.out.println(day +" is invalid.");}
			
			
	}

}
