package com.class02practice;

public class ArithmaticOpsP {

	public static void main(String[] args) {
		
		int num1=100;
		int num2=50;
		
		//add, sub, mult, div
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		
		int sum=num1+num2;  //always do ops right to left, I want num1 and num2 to add so it will be sum there fore will be an int
		int sub=num1-num2;
		int mult=num1*num2;
		int div=num1/num2;
		
		//sum of number 10 and 5 is = 15
		
		System.out.println("The sum of number " +num1 +" and " +num2 + " is = " +sum);
		
		double number1=10.99;
		double number2=90.99;
		
		double sumOfDouble=number1+number2;
		double subOfDouble=number1-number2;
		double divOfDouble=number2/number1;
		
		System.out.println("Result of division of 2 double values " +divOfDouble);
		
		float n1=10.99f;
		float n2=90.00f; 
		
		float f=n2/n1; 
		
		System.out.println("Result of division of 2 float values " +f); //float will give us up to 7 decimal pts. 
		
		//modules operator--> shows REMAINDER of the division !!USE % sign!! 
		
		int mod=10%3;
		System.out.println("Remainder is = " +mod);	// R=1 
		
		int mod1=10%2;
		System.out.println("Remainder is = "+mod1);// R=0
		
		int mod2=15%4;//4*3=12; 15-12=3
		System.out.println("Remainder is = " +mod2); //R=3
		
		int r=(20%7)*3; // STEPS 7*2=14, R=6, 6*3 ANSWER=18
		System.out.println(r);
		
				
	}

}
