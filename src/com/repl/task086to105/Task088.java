package com.repl.task086to105;

public class Task088 { //PASSED
	
	/*
	 * Create a Class Main 
	 * In this class, you should specify the following attributes: 
	 * breed, name, color, and following behaviors: bark(), run(), play().
	 * Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes and behaviors.
	 * The OUTPUT of the program should be as following:
	 * Husky can bark
	 * Husky can run
	 * Husky can play
	 * Bulldog can bark
	 * Bulldog can run
	 * Bulldog can play
	 * Labrador can bark
	 * Labrador can run
	 * Labrador can play
	 */
	
	String breed;
	String name;
	String color;
	
	void canBark () {
		System.out.println(breed + " can bark ");
	}
	
	void canRun() {
		System.out.println(breed + " can run ");
	}
	void canPlay () {
		System.out.println(breed + " can play ");
	}
	
	public static void main(String[] args) {
		
		Task088 dog1=new Task088();
		dog1.breed="Husky";
		dog1.canBark();
		dog1.canRun();
		dog1.canPlay();
		
		Task088 dog2=new Task088();
		dog2.breed="Bulldog";
		dog2.canBark();
		dog2.canRun();
		dog2.canPlay();
		
		Task088 dog3=new Task088();
		dog3.breed="Labrador";
		dog3.canBark();
		dog3.canRun();
		dog3.canPlay();

	}

}
