package com.class17;

public class StaticVarDemo {
	
	static String msg="Please don't fight"; //static variable can be used here 
	
	void printInfo() {
		
		System.out.println(msg);
	}

	public static void main(String[] args) {
		System.out.println(msg); //AND static variable can be used here 

	}

}
