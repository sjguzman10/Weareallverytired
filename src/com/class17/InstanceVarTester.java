package com.class17;

public class InstanceVarTester {

	public static void main(String[] args) {
		// If outside class, but method is static,
		//can access by creating an object of that class!
		
		InstanceVarDemo2 obj=new InstanceVarDemo2();
		System.out.println(obj.age);
		System.out.println(obj.name);
	}

}
