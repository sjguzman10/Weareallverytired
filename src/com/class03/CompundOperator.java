package com.class03;

public class CompundOperator {

	public static void main(String [] args) {
	int num=100; 
	
					//ALWAYS REMEMBER
	num=num+100; //Step 1operation on right; Step 2 result on left
	System.out.println(num); 
	
	num=num-50;
	System.out.println(num);
	
	System.out.println("-----------");
	
	//SHORT CUT for OPs: variable, operation, = #
	int num1=100; 
	num1+=100; //num1=num1+100 Output = 200
	System.out.println(num1);
	
	num1-=50; //Output =150 
	System.out.println(num1); 
	
	num1/=5; //Output=30
	System.out.println(num1);
	
	num1*=10; //Output=300
	System.out.println(num1);
	
	num1+=20; //Output=320 
	System.out.println(num1);
	
	int a=1;
	//a=a+10
	a+=10;
	System.out.println(a); //Output =11
	}
}
