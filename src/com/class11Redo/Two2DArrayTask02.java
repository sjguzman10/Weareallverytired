package com.class11Redo;

public class Two2DArrayTask02 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array that first row will contain 4 names 
		 * and second row will contain grades 
		 * OUTPUT: Your program should print name of the student that has A and B grade 
		 */
		
		String [][] studentGrades= {
				{"April", "John", "Becca", "Diego", "Silvia", "Edgar"},
				{"A", "B", "C", "D", "F"},
		};
		
		System.out.println(studentGrades [0][4]+ " -- " +studentGrades[1][0]);
		System.out.println(studentGrades [0][5]+ " -- " +studentGrades[1][4]);
		System.out.println(studentGrades [0][3]+ " -- " +studentGrades[1][1]);

	}

}
