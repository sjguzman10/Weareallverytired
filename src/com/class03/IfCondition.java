package com.class03;

public class IfCondition {

	public static void main(String[] args) {
		
		System.out.println("Beginning of my program.");
		
		int a=10;
		int b=70;
		
		//always specify condition with IF 
		if (a>b) {
			
			System.out.println(" a is larger than b");
		}
		
		System.out.println("--------");
		
		int temp=29;
		
		if (temp>30) {//IF TRUE
			System.out.println("I am going for a walk.");
		}else {//OTHERWISE --> FALSE
			System.out.println("I stay home");
		}
		
		System.out.println("End of Program.");

	}

}
