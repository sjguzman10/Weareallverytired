package com.class07;

public class Hwmk {

	public static void main(String[] args) {
		//Sum of Odd Numbers 1-50
		int sum=0;
		for (int i=1; i<=50; i+=2) {
			sum=sum+i;
			}
		System.out.println("The sum of odd numbers 1-50 is " +sum);
		
		System.out.println("------------");
		
		//Sum of Even Numbers 1-50
		int result=0;
		for (int x=2; x<=50; x+=2) {
			result=result+x;
		}
		System.out.println("The sum of even numbers 1-50 is "+result);
	}

}
