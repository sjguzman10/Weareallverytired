package com.class06;

public class NotOperator {

	public static void main(String[] args) {
		
		boolean rain=true;
		
		if(!rain) {System.out.println("I will go to the park.");}
		
		boolean boo=!true; //!true makes it false
		
		System.out.println(boo);
		
		boolean boo1=!false; //!false makes it true 
		System.out.println(boo1);
		
		boolean traffic=true;
		
		if (!traffic) {System.out.println("I will come on time.");}
		
		String day="Monday";
		
		if (!day.equals("Friday")) {System.out.println("Today is not Friday");}
		
		//NOT operator ! ---> always placed before the condition

	}

}
