package com.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		/*
		 * we have to identify if number is small, medium, large, xlarge
		 * if number is between 1 and 10 --> small 
		 * if number is between 11 and 100 --> medium
		 * if number is between 101 and 1000--> large 
		 * if number is between 1001 and 100000 --> xlarge 
		 */
		
		int num=2;
		
		if (num<1) {System.out.println("Number is 0 or negative");}
		
		//if number is larger than 1 AND less than 10 
		else if (num>=1 && num<=10) {System.out.println(num + " is a small number");}
		
		//if number is larger than or eq to 11 AND less or eq to 100
		else if (num>=11 && num<=100) {System.out.println(num + " is a medium number");}
		
		//if number is larger than or eq to 101 AND less than or eq 1000
		else if (num>=101 && num<=1000) {System.out.println(num + " is a large number");}
		
		//if number is larger than or eq 1001 AND less than or eq 100000
		else if (num>=1001 && num<=100000) {System.out.println(num + " is a xlarge number");}
		
		
		//if number is larger than 100000
		else {System.out.println(num + " is a huge number");}

	}

}
