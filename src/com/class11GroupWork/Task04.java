package com.class11GroupWork;

public class Task04 {

	public static void main(String[] args) { //me
		/*
		 * Create 2D array of countries: 
		 * north america countries, south america countries, europe countries, asian countries, african countries. 
		 * Then print all values from that array using 2 different loops and calculate how many total countries have been stored.
		 */
		
		String [][] countries= {
				{"Canada", "USA", "Mexico", "Puerto Rico", "Cuba", "El Salvador", "Guatemala"},
				{"Colombia", "Peru", "Argentina", "Chile", "Brazil", "Bolivia"},
				{"Italy", "England", "Spain", "Greece", "Portugal", "Belgium"},
				{"India", "Nepal", "Japan", "China", "Thailand", "Pakistan", "Vietnam", "Turkey"},
				{"Ethiopia", "Nigeria", "Ghana", "Egypt", "Morocco", "Kenya"}
		};
		
		//First Way
		for (int r=0; r<countries.length; r++) {
			
			for (int c=0; c<countries[r].length; c++) {
				
				System.out.print(countries[r][c]+"  ");
			}
			System.out.println();
		}
		
		//Second Way
		System.out.println("------------------other way--------------------");
		for (String [] country:countries) {
			
			for (String c:country) {
				System.out.print(c+"  ");
			}
			System.out.println();
		}
		
		System.out.println("----------Total Countries Stored----------");
	
		int total=countries[0].length + countries[1].length+ countries[2].length +countries[3].length +countries[4].length; 
		System.out.println(total);
		
	
		
	}

}
