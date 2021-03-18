package com.class04;

public class NestedIfMoreExamples {
	
	public static void main (String [] args) {
		
		/*
		 * If it is Friday, go to the movie, otherwise stay at home and study.
		 * 		If it is Friday, then I will check if the day is 13. 
		 * 			If yes, watch a scary movie. If no, watch any movie you like.
		 */
		
		boolean isFriday=true;
		int day=13;
		
		if (isFriday) {
			System.out.println("It is a movie day!");
			
			if (day==13) {System.out.println("I will watch a scary movie.");}
			else {System.out.println("I will watch any available movie");}			
		}
	
		else {System.out.println("I will stay at home and study.");}
		
		System.out.println("---------------Example 2------------");
		
		//Check Assignment and based on the score we display a message 
		
		boolean completed=true;
		int score=65;
		
		if (completed) {
			if (score>90) {System.out.println("Great job!");}
			else if (score>80) {System.out.println("Good job!");}
			else if (score>70) {System.out.println("Good but let's try to do better.");}
			else {System.out.println("Good for trying, but study more!");
			}
		}
		else {
			System.out.println("Please make sure to complete all assignments on time.");
		}

}
}
