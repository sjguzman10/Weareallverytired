package com.class17;

public class ConvertingBetweenSBandString {

	public static void main(String[] args) {
		
		// Converting between String Builder and String 
		
		String var1="Nelson";
		StringBuilder sb1=new StringBuilder(var1);
		sb1.reverse();
		var1=sb1.toString();
		System.out.println(var1);// Original String has now been reversed

	}

}
