package com.repl.task086to105;

public class Task087 { //PASSED
	
	/*
	 * For you to do:
	 * Create a class named 'Main' with specific attributes.
	 * Create two objects of that class in which you will be assigning the following values and then print them.
	 * carColor='Black'
	 * carYear=2019
	 * carMake='BMW'
	 * carColor='White'
	 * carYear=2018
	 * carMake='Toyota'
	 * **Expected Output:**
	 * Car color is Black and car year is 2019 and car model is BMW
	 * Car color is White and car year is 2018 and car model is Toyota
	 */
	
	String carColor;
	int carYear;
	String carMake;
	
	void printCarColor() {
		System.out.print("Car color is " +carColor);
	}
	void printCarYear() {
		System.out.print(" and car year is " +carYear);
	}
	void printCarModel() {
		System.out.println(" and car model is " +carMake);
	}
	
	public static void main (String []args) {
	Task087 car1=new Task087();
	car1.carColor="Black";
	car1.carYear=2019;
	car1.carMake="BMW";
	car1.printCarColor();
	car1.printCarYear();
	car1.printCarModel();
	
	Task087 car2=new Task087();
	car2.carColor="White";
	car2.carYear=2018;
	car2.carMake="Toyota";
	car2.printCarColor();
	car2.printCarYear();
	car2.printCarModel();
	}
}
