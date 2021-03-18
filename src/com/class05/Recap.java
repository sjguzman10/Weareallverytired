package com.class05;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		
		//compiler says error 
		
		Scanner anyVariableName; 
		
		anyVariableName=new Scanner(System.in);
		
		//to capture entire sentence 
		//use ctrl + space to use same identifier as before 
		
		String sentence=anyVariableName.nextLine();
		System.out.println(sentence);
		
		//to capture a number 
		int num=anyVariableName.nextInt();
		System.out.println(num);
		
		//to capture a double 
		double d=anyVariableName.nextDouble();
		System.out.println(d);
		
		//to capture a single character 
		char singlecharacter=anyVariableName.next().charAt(0);
		System.out.println(singlecharacter);
		
	}

}
