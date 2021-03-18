package com.class07;

public class LoopIntro {

	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		
		System.out.println("-----------------");
		
		int time=7;

		if (time<12) {System.out.println("Hello");} //code executes 1 time 

		System.out.println("--------While LOOP---------");
		
		while (time<12) {
			System.out.println("Hello");//code runs forever
			time++; //11+1 =12 STOPS your loops
			//to print 5 times int time=7 > ++ 5 times until 12 
		}
		
		System.out.println("---------- print numbers from 1 to 10 ---------");
		
		int num=1;
		
		while (num<11) { //num<=10 will work the same
			System.out.print(num +" "); //to print next to each other
			num++;
		}
		
		System.out.println();
		System.out.println("---print numers 20 to 40----");
		
		 num=20;
		 
		 while (num<=40) {
			 System.out.print(num + " ");
			 num++;
		 }
		 
		 System.out.println();
		 System.out.println("--- print numbers from 10 to 1---");
		 
		 int a=10;
		 while (a>=1) {
			 System.out.print(a + " ");
			 a--; 
			 //loop will stop when 0>=1 since condition will be false 
		 }
		 

	}

}
