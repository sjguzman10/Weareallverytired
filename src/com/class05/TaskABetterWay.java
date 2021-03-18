package com.class05;

import java.util.Scanner;

public class TaskABetterWay {

	public static void main(String[] args) {
		
		Scanner pp=new Scanner (System.in);
		int height;
		
		System.out.println("Please enter height in inches");
		height=pp.nextInt();
		
		String definition;
		
		if (height<=60) {
			definition="short";
		}
		else if (height>60 && height <=72) {
			definition="medium";
		}
		else {definition="tall";}
		
		System.out.println("You are a person who's height is " +definition);

	}

}
