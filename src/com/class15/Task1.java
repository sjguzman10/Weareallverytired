package com.class15;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Accept username, password, and confirm password from a user and check following requirements:
		 * 1. Username and Password cannot be empty- if so, message ---> "Username and Password cannot be empty".
		 * 2. Password should be minimum 8 characters, if less --> message "Password is too short"
		 * 3. Password cannot contain username. If so---> message "Password cannot contain username"
		 * 4. Password should match confirmed password, if not ---> message "Passwords do not match"
		 * 
		 *Only after all requirements are met---> message "Your user name and password has been created"
		 */
		
		String userName="Aimen";
		String password="Gulshoda";
		String confirmPassword="Gulshoda";
		
		if (userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username and Password cannot be empty");
		}
		
		else if (password.length()<8) {
			System.out.println("Password is too short");
		}
		else if (password.equals(userName)) {
			System.out.println("Password cannot contain username");
		}
		else if (!password.equals(confirmPassword)) {
			System.out.println("Passwords do not match");
		}
		else {
			System.out.println("Your username and password has been created");
		}

	}

}
