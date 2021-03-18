package com.class09;

public class Recap {

	public static void main(String[] args) {
	

		for (int i=1; i<4; i++) { //OUTER LOOP ALWAYS controls inner loop
			for (int j=1; j<5; j++) { 
				System.out.println("Good evening!");
			//INNER LOOP code always finishes one loop at a time; when inside inner loop, will finish until there until prompted to go to the outer 

			}
			
			System.out.println("------------");
		}
		
		System.out.println("---------------Another Example----------");
		
		for (int i=5; i<7; i++) {
			System.out.println("Outer loop");
		
			for (int j=10; j<=12; j++)
			{
				System.out.println("Inner loop");
			}
		}
			

		System.out.println("---------------Another Example----------");
		
		for (int i=1; i<3; i++) {
			System.out.println(i);
		
			for (int j=1; j<=4; j++)
			{
				System.out.println(j);
			}
		}
		
		System.out.println("---- PRINT numbers from 10 to 99 using nested loop----");
		
		for (int i=1; i<10; i++) {
			
			for (int j=0; j<=9; j++)
			{
				System.out.println(i+" "+j);
			}
		}
		

	}

}
