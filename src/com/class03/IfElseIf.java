package com.class03;

public class IfElseIf {
	//to auto complete: ctrl  + space + enter
	
	public static void main(String[] args) {
		//Selective Execution with IF Else IF 
		//Code will figure out which is true and print THAT statement 
		
		//Compare 2 numbers --- > 3 possible conditions 
		double num1 = 100.20;
		double num2 = 15.20;
		//Condition 1 
		if (num1 > num2) {
			 System.out.println("Double value " + num1 + " is larger than " + num2);
		 } 
		//Condition 2
		else if (num1<num2){
			 System.out.println("Double value " + num2 + " is larger than " + num1);
		 }
		//Condition 3 
		 else {
			 System.out.println(num1 + " is equal to " +num2);
		 } 
		
		//Based on the day number define a day (One by one will find the true condition)
		//Print out today is Saturday
		int day=0;
		
		if (day==1) {
			System.out.println("Today is Monday.");
		}
		else if (day==2) {
			System.out.println("Today is Tuesday");
			}
		else if (day==3) {
			System.out.println("Today is Wednesday");
		}
		else if (day==4) {
			System.out.println("Today is Thursday");
		}
		else if (day==5) {
			System.out.println("Today is Friday");
		}
		else if (day==6) {
			System.out.println("Today is Saturday");
		}
		else { //DO NOT NEED DAY (day==7) ONLY {}
			System.out.println("Today is Sunday");
		}
		//to format code: ctrl + shift + f  = windows users 
		// to format code: cmd + shift + f = apple users
		
		}
		
	}

