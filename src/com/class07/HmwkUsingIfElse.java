package com.class07;

import java.util.Scanner;

public class HmwkUsingIfElse {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Please enter two numbers");
		double num1=sc.nextDouble();
		double num2=sc.nextDouble();
		
		System.out.println("Please enter an operator");
		char oper=sc.next().charAt(0);
		double res;
		
		if (oper=='+') {
			res=num1+num2;
		}
		else if (oper=='-') {
			res=num1-num2;
		}
		else if (oper=='*') {
			res=num1/num2;
		}
		else if (oper=='/') {
			res=num1/num2;
		}

		if (res != 0)
				{System.out.println();}
	}

}
