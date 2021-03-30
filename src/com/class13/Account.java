package com.class13;

public class Account {
	
	String userName;
	String password;
	double balance;
	String accountNumber;
	boolean isLoggedIn;
	
	public void login(String userName, String password) {
		if (userName.equals(userName)&&password.equals(password)) {
			System.out.println("Welcome to Bank of America. Your balance is "+balance);
		}
		else {
			System.out.println("Username or password is not correct");
		}
	}
	
	public void printInfo() {
		if (isLoggedIn) {
			System.out.println("Your Account Number is " +
		accountNumber+ "Your balance is "+balance);
		}
	}
	//new method to print values below
	public void printUsernameAndPassword(String userName, String password) {
	
	if (userName.equals("Bryan")) {
		System.out.println("Hi Bryan");
	}	
	else {
		System.out.println("Bye Bryan");
	}
	}

}
