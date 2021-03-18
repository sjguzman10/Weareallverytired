package com.class05Review;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		
		Scanner anyVariable;
		
		anyVariable=new Scanner(System.in);
	
		//to capture entire sentence 
		//control + space to capture variable & next command
		
		String sentence=anyVariable.nextLine();
		System.out.println(sentence);
		
		//to capture a number 
		int num=anyVariable.nextInt(); 
		System.out.println(num);
		
		//to capture double 
		double d=anyVariable.nextDouble();
		System.out.println(d);
		
		//to capture single character 
		char singleCharacter=anyVariable.next().charAt(0);
		System.out.println(singleCharacter);

	}

}
