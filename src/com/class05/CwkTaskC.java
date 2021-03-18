package com.class05;

import java.util.Scanner;

public class CwkTaskC {

	public static void main(String[] args) {
		/* Write a program that will read three inputs of scores (quiz, mid term, and final scores) 
		 * 		and determine the grade based on the following rules: 
		 * If the average score >=90 ; grade=A
		 * If the average score >= 70 and <90 ; grade=B
		 * If the average score>=50 and <70; grade=C
		 * If the average score<50; grade=F
		 */
		
		Scanner input;
		int quiz, midTerm, finalExam;
		String grade;
		input=new Scanner (System.in);
		
		System.out.println("What is your quiz score?");
		quiz=input.nextInt();
		
		System.out.println("What is your midterm score?");
		midTerm=input.nextInt();
		
		System.out.println("What is your final exam score?");
		finalExam=input.nextInt();
		
		int finalScore=(quiz+midTerm+finalExam)/3;
		
		if (finalScore>=90) {grade="A";}
		
		else if (finalScore>=70 && finalScore<90) {grade="B";}
		
		else if (finalScore>=50 && finalScore<70) {grade="C";}
		
		else {grade="F";}
		
		System.out.println("Your grade is " + grade);

	}

}
