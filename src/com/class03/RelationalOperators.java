package com.class03;

public class RelationalOperators {
	
	public static void main (String [] args) {
		
		int a=10;
		int b=7;
		
		System.out.println(a>b); //Output = true 
		System.out.println(a<b); //Output = false 
		System.out.println(a==b);//Output = false 
		System.out.println(a!=b); //Output= true ; != NOT equal 
		
		//ACTION ON RIGHT, Answer on LEFT 
		//Result of operations will ALWAYS be a boolean answer 
		
		System.out.println("------------");
		
		boolean result=a>=b;
		boolean result1=a<=b; 
		
		System.out.println(result);
		System.out.println(result1);
		
		
		System.out.println("-----------");
		
		int c=20;
		int d=29;
		
		System.out.println(c==d); //checking equality 
		System.out.println(c=d); //assigning the value 
	}

}
