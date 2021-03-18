package com.class02;

public class VariableDeclaration {

	public static void main(String[] args) { 
		
		//1st way to create a variable 
		short b=200; //create a variable and assigning value 
					//declared a variable and initialize  
		
		//2nd way- 
		int sum;//create a variable
		sum=20;//declare the value 
		sum=30;//reassign the value  
		//this way helps when creating a variable when you don't know the value yet; include it and later add on 

		/* Declaring all variables all in one line AND all integer type 
		*int x 
		*int y
		*int z
		*/
		int x,y,z;
		
		x=10;
		y=20;
		//z=30.9; Error because it is not an integer   
		
		//ONE variable. ONE value 
		
		//I would like to change the vlaue of x. 
		x=70; 
		
		System.out.println(x); 
		
		int num=33;
		//using value of a different variable to initialize value of new variable 
		int num2=num; 
		
		System.out.println(num2); 
		
	}

}
