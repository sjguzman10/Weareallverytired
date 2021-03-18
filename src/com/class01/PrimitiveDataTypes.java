package com.class01;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
/*
 * byte- datatype ---> what kind of values we are going to store
 * box1 - name of the variable ---> label of the box 
 * 10 - value that we are assigning to that variable --> values that we put inside the box * 
 */
		
		//we are storing whole numbers 
		byte box1=127; //-128 till 127
		short box2=32767; //-32767 to 32767
		int box3=10000000;//-2147483648 to 2147483647
		long box4=100000000L;//by adding L you are telling data is a long number 
		
		//we are storing floating numbers
		float f=12.99f; //adding an f at the end tells Java to recognize as a floating number 
		double d=12.95;

		//we are storing single character values 
		char a='*';
		char b ='F';
		char c = '1';
		
		//to store boolean values 	
		boolean variable1=true; 
		boolean variable2=false;
		
		//I would like to store value 99
		int number=99; 
		
		System.out.println(d); //12.95
		System.out.println(a); //*
		
		//System.out.print(bool); Program gives error because variable bool is not created in correct order. Variable must come first.
		//boolean bool=true; Program must be in order to execute TOP -> BOTTOM
		
		System.out.println (variable1); //true
		System.out.println ("variable1"); //anything places in quotes it will print as text 
		
		
	}

}
