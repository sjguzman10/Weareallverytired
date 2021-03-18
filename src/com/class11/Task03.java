package com.class11;

public class Task03 {

	public static void main(String[] args) {
		/*
		 * Create 2D array of cars : american, german, korean, italian. 
		 * Then retrieve all values from that array using 2 different loops
		 */
		
		String [] [] cars= {
				{"tesla", "ford", "chevy", "dodge"},
				{"bmv", "audi", "porsche", "volkswagen"},
				{"kia", "hyundai"},
				{"fiat", "ferrari", "maserati", "lamborghini"}
		};
		
		for (int r=0; r<cars.length; r++) {
			
			for (int c=0; c<cars[r].length;c++) {
				
				System.out.println(cars[r][c]+" ");
			}
			System.out.println();
		}
		System.out.println("----------------------------------");
		
		for (String [] carModel:cars) {
			
			for (String c:carModel) {
			System.out.println(c+ " ");
			}
			System.out.println();
		}
		
	}

}
