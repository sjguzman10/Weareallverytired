package com.class15;

public class StringDemo1 {

	public static void main(String[] args) {
		
		String name="Azizi"; //mostly used because of shorter syntax
		String name1=new String ("Azizi"); // creating object of String class LONGER WAY BUT SAME as above
		
		System.out.println(name);
		//Length ---> number of characters in a String object 
		System.out.println(name.length());
		name="  Azizi";
		int len=name.length(); //Reminder: Counts spaces as well 
		System.out.println(len);
		
	}

}
