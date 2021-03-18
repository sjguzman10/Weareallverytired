package com.class11Redo;

public class TwoDArrayOtherWay {

	public static void main(String[] args) {
		
		System.out.println("Another way of creating a 2D array");
		
		int [][] numbers= {
								{1,2,3,4},
								{10,20,30,40},
								{100,200,300}
					};
		
		System.out.println(numbers[0][2]); //print number 3
		
		System.out.println(numbers[1][1]); //20
		
		//what is the output? 
		int sum=numbers[1][2]+numbers[0][3];
		System.out.println(sum);
		
		//what is the output?
		//System.out.println(numbers[0][4]); index 4 out of bounds
		
		numbers[2][2]=500;
		System.out.println(numbers[2][2]);
	}

}
