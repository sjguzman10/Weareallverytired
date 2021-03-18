package com.class11Redo;

public class Cwk02 {

	public static void main(String[] args) {
		/*
		 * Using 2D array create a grocery list 
		 * Inside you should have an array of veggies, fruits, dairy and sweets 
		 * Retrieve all values from that array using 2 different loops 
		 */
		
		String [][] groceries= {
				{"brocoli", "carrots", "sweet potatoe", "beets", "onion"},
				{"blueberries", "strawberries", "raspberries", "oranges", "coconut"},
				{"soy milk", "eggs", "cheese", "creamer"},
				{"pan dulce", "chocolate"}
		};
		
		for (int r=0; r<groceries.length; r++) {
			
			for (int c=0; c<groceries[r].length; c++) {
				
				System.out.print(groceries[r][c]+"  ");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------");
		
		for (String [] aisle:groceries) {
			
			for (String item:aisle) {
				
				System.out.print(item+"  ");
			}
			System.out.println();
		}

	}

}
