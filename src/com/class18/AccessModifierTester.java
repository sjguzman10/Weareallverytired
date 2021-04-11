package com.class18;

import java.util.Scanner;

public class AccessModifierTester {

	public static void main(String[] args) {
		//Example of using and connecting the modifiers between classes  
		
		AccessModifierDemo obj1=new AccessModifierDemo(); 
		//System.out.println(obj1.bankAccountPassword);
		System.out.println(obj1.name);
		System.out.println(obj1.SSNNumber);
		
		Scanner scanner=new Scanner(System.in);
		scanner.next();
		

	}

}
