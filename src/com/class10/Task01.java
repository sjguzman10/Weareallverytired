package com.class10;

public class Task01 {

	public static void main(String[] args) {
		/*
		 * Create an array of chars
		 * and store grades into it: A,B,C,D,E,F.
		 * Then print a grade B
		 */
		
		//TWO STEPS
		char [] grade=new char[6];
		grade [0]='A';
		grade [1]='B';
		grade [2]='C';
		grade [3]='D';
		grade [4]='E';
		grade [5]='F';
		
		System.out.println(grade [1]);
		
		System.out.println("-----------Another way of creating an array---------");
	
		//ONE STEP
		char [] grades= {'a', 'b', 'c','d', 'e', 'f', 'g', 'h'};
		
		//char [] grades1;
		//grades1= {}; ----> will not work 
		
		//to print grade G, still take variable grade, and still specify index
		System.out.println(grades [6]);
		
		
		//Print how many elements/index in grades 
		System.out.println("Number of elements in 2nd array "+grades.length);
	

	}

}
