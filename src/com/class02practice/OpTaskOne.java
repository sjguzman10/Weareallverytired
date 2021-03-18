package com.class02practice;

public class OpTaskOne {

	public static void main(String[] args) {
		//write a java prg to +,-,*,/ 2 decimal values. Your program should say "The _ of 2 numbers _ and _ is equal to __."
		double n1=50.55;
		double n2=10.99;
		
		double sum=n1+n2;
		double sub=n1-n2;
		double mult=n1*n2;
		double div=n1/n2;
		
		System.out.println("The sum of " +n1 + " and " + n2 + " is equal to " +sum);
		System.out.println("The subtraction of " +n1 + " and " +n2 + " is equal to " +sub);
		System.out.println("The multiplication of " +n1 + " and " +n2 +" is equal to " +mult);
		System.out.println("The division of " +n1 + " and " +n2 +" is equal to " +div);

	}

}
