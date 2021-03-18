package com.class06;

public class SwitchExamples {

	public static void main(String[] args) {
		/*
		 * Store gender using M or F 
		 * Based on the gender we will specify 
		 * 		if M --> Male
		 * 		if F --> Female 
		 * 		otherwise --> not sure 
		 */
		
		char gender='F';
		String description;
		
		//values must match variable type = cases match char 
		//switch CANNOT work with boolean or other variable types
		
		switch (gender) {
		case 'M' :
			description="Male";
			break;
		case 'F' :
			description="Female";
			break;
		default:
			description="N/A";
		}

	}

}
