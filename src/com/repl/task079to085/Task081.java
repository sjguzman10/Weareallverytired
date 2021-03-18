package com.repl.task079to085;

public class Task081 {

	public static void main(String[] args) { //PASSED BUT PREFILLED HOW???? 
		/*
		 * **For you to do:**
		 * Write a program that prints the highest value in the array.
		 * **Expected Output:**
		 * input [5,4,8]
		 * 8
		 */
		
		int[][] arr = {
                {5,2,3,7},
                {1,5,1,1},
                {8,3,1,2}
        };
        // Initialize maximum element
        int max = arr[0][0];

        // Traverse array elements from second and
        // compare every element with current max
        for (int [] arr1:arr) {
            
        	for (int element:arr1) {
                
        		if(element>max){
                    max=element;
                }
            }
        }

        System.out.print(max);



	}

}
