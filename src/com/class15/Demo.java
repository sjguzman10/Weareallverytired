package com.class15;

public class Demo {

	public static void main(String[] args) {
		
		String str=new String("Hi");
		String str1="hi";
		System.out.println(str1.length());
		
		String str2="Hi,      How are you?";
		System.out.println(str2.length()); //space counts in 
		
		//to lower case 
		String str3="HOW ARE YOU?";
		System.out.println(str3.toLowerCase());

	}

}
