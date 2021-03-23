package com.class17;

public class InstanceVariableDemo {

	int number; //instance variable INSIDE CLASS, OUTSIDE MAIN METHOD 
	void printNumber() {
		System.out.println(number);
		String name="Stephanie";
	}
	
	void printNumbers2() {
		System.out.println(number);
		//System.out.println(name); CE 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstanceVariablesDemo obj=new InstanceVariableDemo;
		
		//SEE 905 AM 

	}

}
