package com.class13;

public class DogType {
	
	public String breed;
	public String size;
	public String colour;
	public int age;
	
	public void bark () {
		System.out.println("ruff ruff and wow wow");
	}
	
	public void sleep () {
		System.out.println("ZZZZZZzzzzzzz.....");
	}
	
	public void eat () { //want to print that dog wants to eat 5 times
		for (int i=0; i<5; i++) {
		System.out.println("yum yum yum......");
	}
	}
	
	public void look () {
		System.out.println("Hi I am a dog, my color is "+ colour);
	}
	
	public static void main(String [] args) {
	
	DogType Dog1=new DogType();
	Dog1.breed="Bulldog"; //properties and attributes 
	Dog1.size="large";
	Dog1.colour="light gray";
	Dog1.age=5;
	Dog1.bark(); //behaviors 
	Dog1.eat();
	Dog1.sleep();
	Dog1.look();
	
	DogType Dog2=new DogType();
	Dog2.breed="Beagle";
	Dog2.size="large";
	Dog2.colour="orange";
	Dog2.age=6;
	Dog2.look();
	
	DogType Dog3=new DogType();
	Dog3.breed="German Shepherd";
	Dog3.size="large";
	Dog3.colour="white and orange";
	Dog3.age=6;
	
	}

}
