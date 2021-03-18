package com.class12;

public class Task07OtherWay {

	public static void main(String[] args) { //REVIEW THIS!!!
		// //Write a Java Program to print the first 10 numbers of Fibonacci series.
		
		int a=0;
		int b=1;
		int c;
		
		for (int i=1; i<=10; i++) {
			
			c=a+b;
			
			b=c; //c becomes b
			a=b; //b becomes a
			
			System.out.print(c+ " "); //MISSING SOMETHING
		}
		
		System.out.println();
		System.out.println("----------ANOTHER WAY---------------");
		
		int f1=0;
		int f2=1;
			for(int f=1;f<=20;f++) {
				System.out.print(f1+" ");
				f1=f1+f2;
				f2=f1-f2;			
				
			}

	}

}
