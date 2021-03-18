package com.class11Redo;

public class Cwk01 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array of cars: american, german, japanese, italian 
		 * Then retrieve all values from that array using 2 different loops 
		 */
		
		String [][] cars= {
				{"Ford", "Chevy", "Dodge", "Jeep", "Tesla"},
				{"BMW", "Porsche", "Wolkswagen", "Audi"},
				{"Toyota", "Nissan", "Honda"},
				{"Fiat", "Maserati", "Lamborghini", "Ferrari"}
		};
		
		for (int r=0; r<cars.length; r++) {
			
			for (int c=0; c<cars[r].length ;c++) {
				
				System.out.print(cars[r][c]+ "  ");
			}
			System.out.println();
		}
		
		System.out.println("---------------------------");
		
		for (String[] car:cars) {
			
			for (String c:car) {
				
				System.out.print(c+"  ");
			}
			System.out.println();
		}

	}

}
