package com.class17;

public class PrintingInReverse {

	public static void main(String[] args) {
		
		
		int salary=123456789;
		
		//convert integer to string 
		StringBuilder sb=new StringBuilder(String.valueOf(salary));

		sb.reverse();
		salary=Integer.parseInt(sb.toString());
		System.out.println(salary); //
	}

}
