package com.class16;

public class StringVsStringBuilder {
	
	public static void main (String [] args) {
		
		String var1="USA";
		String var2="USA";
		String var3="USA";
		String var4=new String ("USA");
		System.out.println(var1==var2); //stored in same address
		System.out.println(var1==var4); //stored IN DIFFERENT address and why we get false 
		System.out.println(var1.equals(var2));
		System.out.println(var1.equals(var4));
		
	}

}
