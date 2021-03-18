package com.class05;

public class IfWithNoBraces {

	public static void main(String[] args) {
		
		String day="Friday";
		
		if(day.equals("Friday"))
			//no {} = ONLY ONE statement ALLOWED to belong to IF or ELSE
			System.out.println("Today is my movie day"); //i.e. THIS would be the only one to belong to the IF Block
			System.out.println("Tomorrow I have class at Syntax");
		
		System.out.println("---End of the program.---");
		
		int num=10;
		
		if (num>=10)
			System.out.println("Number is larger than 10");
		else //if no {}, Java identifies only 1 statement per block (if block or else block)
			System.out.println("Number is less than 10");
			System.out.println("Second statement inside block"); //i.e THIS will also print
	}

}
