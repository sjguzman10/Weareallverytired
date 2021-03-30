package com.class13;

public class SimpleClass {
	
	String var1;
	int var2;
	
	public void method1() {
		System.out.println("Value of var 1 " +var1); //this value will be printed when calling this method
	}
	
	//return the data type that is stored in 
	//similar to nextInt nextBoolean when using Dcanner 
	public String returnTheValueOfvar1 () {
		return "Stephanie"; //when calling this it will get stored inside var1
	}
	
	public void method2(String variable1) {
		var1=variable1;
	}
	

}
