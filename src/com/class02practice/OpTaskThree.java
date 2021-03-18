package com.class02practice;

public class OpTaskThree {

	public static void main(String[] args) {
		// write a prg to print the area and perimeter of a rectangle with width =5 and height = 8. 
		//your program should say "The perimeter of a rectangle with width _ & height _ is equal to _ and the area is _. "
		
		int w=5;
		int h=8;
		
		int perimeter=2*(w+h);
		int area=w*h;
		
		System.out.println("The perimeter of a rectangle with width " +w + " and height " +h +" is equal to " +perimeter+".");
		System.out.println("The area of a rectangle with width " +w +" height " +h +" is equal to " +area +".");

	}

}
