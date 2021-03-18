package com.class10;

public class Task02 {

	public static void main(String[] args) {
		/*
		 * Create an array of names and store all names of your group. 
		 * Then print your name from that array. (use 2 different ways of creating an array).
		 * Create an array of words: Java, Saturday, day, coding, is. 
		 * Print the following sentence using elements of array: “Saturday is Java coding Day”.
		 */
		
		System.out.println("------Task 1-------");
		//First Way
		String [] names=new String [8];
		names [0]="Ahmad";
		names [1]="Alex";
		names [2]="Angelo";
		names [3]="Bryan";
		names [4]="Gul";
		names [5]="Korkmaz";
		names [6]="Stephanie";
		names [7]="Tolga";
		
		System.out.println(names [6]);
		
		//Second Way
		String [] name= {"Ahmad", "Alex", "Angelo", "Bryan", "Gul", "Korkmaz", "Stephanie", "Tolga"};
		System.out.println(name [6]);
		
		System.out.println("------Task 2--------");
		
		String [] words= {"Java", "Saturday", "day", "coding", "is"};
		System.out.println(words[1]+ " "+ words[4]+" "+ words[0]+" "+words[3]+" "+ words[2]);
	}

}
