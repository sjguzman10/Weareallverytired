package com.class07;

public class ForLoopIntro {

	public static void main(String[] args) {
		
		//REMINDER: Declaring VALUES only happen once. Increments happen after. 
		//you can repeat the same variable in the same loop
		
		for (int i=1; i<=3; i++) {
			System.out.println("Hello");
		}
		
		System.out.println("---- Print numbers from 1 to 50----------");
		
		for (int i=1; i<=50; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("------Print numbers 10 to 1 -------");
		
		for (int i=10; i>=1; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("----What is my output-----");
		
		for (int i=5; i<=50; i+=10) {
			System.out.print(i + " ");
			}

	}

}
