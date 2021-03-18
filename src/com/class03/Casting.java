package com.class03;

public class Casting {
	
	public static void main (String [] args) {
		
		//int i=10.99; type mismatch
		
		//WIDENING or IMPLICIT 
		double d=10;
		System.out.println(d);
		
		int num=10; 
		
		//NARROWING or EXPLICIT 
		int i=(int)12.99;
		System.out.println(i);
		/* 
		 * storing will not work since trying to store a double 
		 * in an integer, which does not hold decimals
		 */
		
		byte b=(byte)130;
		System.out.println(b);
		
		int cakePiece=11;
		cakePiece/=4;
		System.out.println(cakePiece); //Output=2
		
		
		int number=12;
		double result=number/5; 
				//if you need a precise #, always use double
		System.out.println(result);// Output = 2.0
		//division with int will give you int
		
		double newNum=10;
		newNum=newNum/3;
		//division with int and double will give double 
		System.out.println(newNum);
		
		//int num1=10+10.5 THIS WILL NOT work since data mismatch
		//int can not hold decimals 
		
		double num1=10+10.5; 
		System.out.println(num1);
	}

}
