package com.class04;

public class HwkTask01PartA {

	public static void main(String[] args) {
		/*You are a loan specialist and you need to ask user what is the amount of loan is needed. 
		 * If loan is less or equal to 200,000 then you would lend the money 
		 * otherwise you would reject the client.
		 */
		
		int loanAmount=50000;
		
		if (loanAmount<=200000) {System.out.println("Loan is approved.");}
		else {System.out.println("Loan is rejected");};
	}
}
