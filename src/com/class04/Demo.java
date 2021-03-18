package com.class04;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		//shortcut for Windows: ctrl+shift+o
			//shortcut for mac: cmd+shift+o
		
		Scanner scan=new Scanner(System.in); 
		
		System.out.println("Please enter any text.");
									//captures entire text with spaces
		String text=scan.nextLine(); //scan.nextLine(); ---> Capture input from console
										//once you enter text you MUST HIT ENTER
		
		System.out.println("Text that I entered is - "+text);
		
		System.out.println("Please enter your name ");
		
		String name=scan.next(); //captures 1 word until space
		
		System.out.println("Nice to meet you " +name);
		
		System.out.println("Please enter your age ");
		
		int age=scan.nextInt();
		
		System.out.println("My name is " +name + " and I am " +age + " years old");
	}
}
