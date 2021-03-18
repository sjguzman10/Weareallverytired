package com.class11Redo;

public class NestedForLoopFor2DArray {

	public static void main(String[] args) {
		
		int [][] numbers= {
				{10, 20, 30, 40},
				{90, 80},
				{1, 2, 3, 4, 5, 6, 7}
		};
		
		System.out.println(numbers.length);//total number of single arrays 
		
		System.out.println(numbers[1].length); //total number of elements in my second array
		
		System.out.println("----------");
		
		for (int r=0; r<numbers.length; r++) {
			
			for (int c=0; c<numbers[r].length; c++) {
				
				System.out.print(numbers[r][c]+" ");
			}
			System.out.println();
		}
		
		System.out.println("-----USING ADVANCED FOR LOOP---------");
		
		for (int []array:numbers) {
			
			for(int n:array) {
				System.out.print(n+ " ");
			}
			System.out.println();
		}
	}
}
