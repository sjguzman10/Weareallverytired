package com.class02;

public class HomeworkReview {

	public static void main(String[] args) {
		//variables happens only ONCE ; changing the value many times 
		
		byte a=10; //creating a variable and assigning value to it 
		short b=100;
		int c=1000; //First value c is 1k
		c=3000; //creating a variable and assigning value to it and now change value c is 3k
		long d=1000000;
		
		float e=12.98f;
		double f=15.905;
		
		char g='!';
		boolean h=true;
		
		// HOWEVER you CAN change the number of your variable 
		//reassign the value (change the value)
		c=2000; //3rd time is now updated to 2k
		System.out.println(c);
		
		//byte a=20 //IS NOT possible can code like this "byte" can only be written once. 
		//JAVA complains because you attempted to do a duplicate variable 
		
		//c=12.99; error: type mismatch since variable c can only hold int values 
		
		//c=true; error; mismatch since it is not boolean 
	}

}
