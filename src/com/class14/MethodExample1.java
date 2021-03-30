package com.class14;

public class MethodExample1 {

	public static void main(String[] args) {
		// nothing will be printed  on our screen since no System.out.print instruction 
		//UNTIL SYSO added 
		
		int num=method1(12,10);
		System.out.println(num);
		method2();

	}
	
	public static int method1(int num1, int num2) {
		
		int num3;
		num3=num1+num2;
		return num3;
	}
	
	public static void method2() { //void when you want to do something but don't want feedback OR want to print something 
		for (int i=0; i<5; i++) {
			System.out.println("Hi");
		}
	}

}
