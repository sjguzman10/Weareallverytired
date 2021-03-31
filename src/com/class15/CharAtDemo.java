package com.class15;

public class CharAtDemo {

	public static void main(String[] args) {
		// Selecting only 1 character, not a phrase 
		
		//Which is the 3rd character? 
		String name="Roheen";
		System.out.println(name.charAt(2));
		
		//How many e's are in this String? 
		int sum=0;
		for (int i=0; i<name.length(); i++) {
			if(name.charAt(i)=='e') {		
				sum++; 		
			}
		}
		System.out.println(sum + " letter e's are found");
	}

}
