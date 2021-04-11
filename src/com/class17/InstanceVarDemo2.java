package com.class17;

public class InstanceVarDemo2 {
	
	static String name="Steph"; //static var italics 
	int age=31;
	void printInfo() {
		
		//If I am inside the same class and my method is not static..I can use my variables directly 
		
		double salary=120000;
		System.out.println(salary); //color purple with local vars 
		System.out.println(name +" " +age); //color blue with instance vars
	}

}
