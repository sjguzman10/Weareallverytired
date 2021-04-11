package com.class18;

public class Task01 {
	
	/*
	 * Create a method that will accept an array as parameters
	 * and will return a sum of all elements from that array.
	 * Method should be visibly only within same package
	 * and accessible by the creating an instance of the class
	 */
	
	//use default method and instance 
	
	double sumArray(double[] arr) { //if wanted to put in another package, make public double not just double 
		double sum=0;
		for (double elements:arr) {
			sum+=elements;
		}
		return sum;
	} 
	
}
