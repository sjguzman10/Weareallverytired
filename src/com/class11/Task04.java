package com.class11;

public class Task04 {

	public static void main(String[] args) {
		/*
		 * Using 2D array create a grocery list.
		 * Inside you should have an array of 
		 * veggies, fruits, dairy and sweets. 
		 * Retrieve all values from that array using 2 different loops
		 */
		
		String [] [] groceries= {
				{"Brocoli", "Carrots", "Sweet Potatoe", "Beets"},
				{"Apples", "Blueberries","Strawberries", "Mango"},
				{"Eggs", "Milk", "Creamer", "Cheese"},
				{"Chococalte Cake", "Pan Dulce"}
		};
		
		for (String [] section:groceries) {
			
			for (String item:section) {
				System.out.println(item + " ");
			}
			System.out.println();
		}

	}

}
