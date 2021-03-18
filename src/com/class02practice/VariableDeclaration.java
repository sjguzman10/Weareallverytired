package com.class02practice;

public class VariableDeclaration {

	public static void main(String[] args) {
		
		//1st WAY to declare a variable 		
		short b=200; //create a variable & assign value -byte does not work here since byte is too small 
					//declared a variable and initialized it 
		
		//2nd WAY
		int sum; //this is a way to create a variable AND have it ready for later
		sum=20; //initialize variable here
		sum=30; //reassign the value 
		
		/*
		 * int x can store multiple values later on like below
		 * int y
		 * int z
		 */
		
		int x,y,z; 
		x=10; 
		y=20; 
		//z=30.9; This would be ERROR mismatch since z is not double and integer 
		
		//ALWAYS remember one variable holds one value; but values can change 
		
		x=70;
		
		System.out.println(x);
		
		int num=33;
		int num2=num;
		
		System.out.println(num2);
	}

}
