package com.class11Redo;

public class AllValuesFrom2DArray {

	public static void main(String[] args) {
		
		String [][] usa= {
				{"Alexandria", "Oakton", "Arlington", "Virginia Beach", "Fairfax"},
				{"Philly", "Strassburgh", "Pittsburgh"},
				{"Boston", "Quincy", "Springfield", "Burlington"},
				{"Los Angeles", "Long Beach", "San Francisco", "Sacramento", "Santa Barbara"},
				{"Miami", "Orlando", "Tampa", "Tallahassee"}
		};
		
		System.out.println(usa.length);//5 arrays
		System.out.println(usa[0].length); //5 elements in first array/5 columns in 1st row
		System.out.println(usa[1].length); //3 elements in second array/3 columns in 2nd row 
		System.out.println(usa[2].length); //4 elements in third array/4 columns in 3rd row
		
		//to print all 
		for (int r=0; r<usa.length; r++) { //iterates over rows
			
			for (int c=0; c<usa[r].length; c++) {
				
				System.out.print(usa[r][c]+"  ");
			}
			System.out.println();
		}
		
		System.out.println("-------USING NESTED FOR EACH LOOP -----------");
		
		for (String[] cities:usa) {
			
			for (String city:cities) {
				System.out.print(city+"  ");
			}
			System.out.println();
		}
		
	}
}
