package com.class13;

public class BankApplication {

	public static void main(String[] args) {
		// Created an object, assigned values acct number, username, password, and balance
		//combining attributes from Account class 
		
		Account ghulamsAccount=new Account();
		ghulamsAccount.accountNumber="123";
		ghulamsAccount.userName="Ghulam123";
		ghulamsAccount.password="pass123";
		ghulamsAccount.balance=1400;
		ghulamsAccount.printUsernameAndPassword("Bryan", "Ahmed123");
		
	
	}

}
