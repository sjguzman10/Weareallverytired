package com.class17;

public class InstanceVariableDemo {

	int number; //instance variable INSIDE CLASS, AND OUTSIDE METHOD; no loops or nothing else that can make it a local variable 
	
	void printNumber() {
		System.out.println(number);
		String name="Stephanie";
	}
	
	void printNumbers2() {
		System.out.println(number); // CAN print here since number inside class used in a class 
		//System.out.println(name); //WIll not be accessed since name lives in local variable 
	}
	
	public static void main(String[] args) {
		
		//by creating an object of that class, it removes restrictions & can use Instance Variable any time! 
		
		InstanceVariableDemo obj=new InstanceVariableDemo();
		System.out.println(obj.number);
		

	}

}
