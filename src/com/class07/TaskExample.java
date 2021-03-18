package com.class07;

public class TaskExample {

	public static void main(String[] args) {
		//What is my output? DEBUG FOR KEY
		
		int sum=0;
		
		for (int i=1; i<=5; i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		
		
		System.out.println();
		System.out.println("----------");
		
		int result=0;
		for (int i=2; i<10; i+=2) {
			result+=i; //if to print here, would give each result until final result 
			System.out.println(result);
		}
		System.out.println(result); //When printing outside, will give final result 
	}

}
