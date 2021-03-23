package com.class17;

public class LocalVariableDemo {
	
	/*
	 * Are the variables which are declared inside a method, constructor or any block 
	 * of code like if conditions, while loop, for loop, do while loop, switch statement 
	 * anything inside a class that has a "{" and ending with "}"
	 */
	
	void printInfo(String name) {
		String phoneNumber="123456789";
		System.out.println(name);
	}
	
	void printInforWithAddress(String name, String address) {
		
		System.out.println(name+address);
		//System.out.println(phoneNumber); CE not defined 
	}

	public static void main(String[] args) {
		
		String name="Local";
		
		for (int i=0; i<5; i++) {
			
			System.out.println(i);
		}
		
		//System.out.println(i); CE not defined 
		
		

	}

}
