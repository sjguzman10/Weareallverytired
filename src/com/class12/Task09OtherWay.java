package com.class12;

public class Task09OtherWay {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array
		
		int[]arr= {900,20,3,45,89,76,45,125,367,145};
		
		int large, secondLarge;
		
		large=0;
		secondLarge=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>large) {
				
				secondLarge=large;
				
				large=arr[i];
				
			}else if(arr[i]>secondLarge) {
				
				secondLarge=arr[i];
			}
			
		}
		System.out.println(large);
		System.out.println(secondLarge);

	}

}
