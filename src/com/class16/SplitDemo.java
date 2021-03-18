package com.class16;

public class SplitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String var1="Today is Wednesday";
		System.out.println(var1.length()); //gives me numbers of characters in present
		//number of spaces plus 1 will give me the number of words 
		String [] strArr=var1.split(" "); //splits into arrays
			for (String word:strArr) {
				System.out.println(word);
			}
			
		String var2="Syntax is best. Batch 9 is great.";
		String [] strArr2=var2.split("[.]");
		System.out.println(strArr2.length);
		for (int i=0; i<strArr2.length; i++) {
			System.out.println(strArr2[i]);
		}
		
		

	}

}
