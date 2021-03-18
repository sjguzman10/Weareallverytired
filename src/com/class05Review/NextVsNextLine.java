package com.class05Review;

import java.util.Scanner;

public class NextVsNextLine {

	public static void main(String[] args) {
		
		Scanner scan;
		scan=new Scanner(System.in);
		
		System.out.println("Enter number.");
		int num=scan.nextInt();
		
		System.out.println(num);
		
		System.out.println("Enter text");
		String text=scan.next();
		
		System.out.println(text);
		
		System.out.println("End of program.");
	}

}
