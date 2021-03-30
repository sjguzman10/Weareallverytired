package com.class14;

public class CalculatorTester {
	
	public static void main (String []args) {
		
		//create an object from calculator class 
		
		Calculator calculator=new Calculator(); 
		
		//calling in the add method from calculator class & printing result
		System.out.println(calculator.add(10, 12));
		
		//casting answer
		int result=(int)calculator.sub(15.5, 10);
		System.out.println(result);
		
		//not casting
		double results=calculator.sub(15.5, 10);
		System.out.println(results);
		
	}

}
