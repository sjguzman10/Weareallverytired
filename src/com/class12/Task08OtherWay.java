package com.class12;

public class Task08OtherWay {

	public static void main(String[] args) {
		// Maximum and minimum number in the array?
		
		int[]arr= {20,10,9,5,6,7,34,88,90,156,0};
		
		
		int max,min;
		min=arr[0];
		max=arr[0];
		
		
		for(int i=1;i<arr.length;i++) {
			if(!(arr[i]>min)) {
				min=arr[i];
			}else {
				max=arr[i];
			}
		}
		System.out.println(max+" is maximum number");
		System.out.println(min+" is minimum number");

	}

}
