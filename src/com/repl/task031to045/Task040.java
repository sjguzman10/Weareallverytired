package com.repl.task031to045;

import java.util.Scanner;

public class Task040 {

	public static void main(String[] args) { //PASSED
		/*
		 * By using the switch statement concept please validate what is the responsibility each instructor in the syntax solution.
		 */
		
		Scanner input;
		String instructor, assignment;
		
		input=new Scanner (System.in);
		System.out.println("Enter the name of the instructor");
		
		instructor=input.nextLine();
		
		switch(instructor) {
		
		case "Asghar":
			assignment="Will take care of Java Assignment";
			break;
			
		case "Moazzam":
			assignment="Will take care of SDLC Assignment";
			break;
			
		case "Weqas":
			assignment="Will take care of Selenium Assignment";
			break;
			
		case "Asel":
			assignment="Will take care of every Assignment";
			break;
			
		default:
			assignment="Invalid instructor selected";}
		
		System.out.println(assignment);

	}

}

//First Output: "Enter name of the instructor"
//case 1: if User provided the name as Asghar as input it should show  "Will take care of Java Assignment"
//case 2: if User provided the name as Moazzam as input it should show  "Will take care of SDLC Assignment"
//case 3: if User provided the name as Weqas as input it should show  "Will take care of Selenium Assignment"
//case 4: if User provided the name as Asel as input it should show  "Will take care of every Assignment"
//Other than these four names if the user provides any other names --> " Invalid instructor selected"