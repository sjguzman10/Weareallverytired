package com.class10;

public class AllElements {

	public static void main(String[] args) {
		
		
		
		//First Way
		System.out.println("---1st Way---");
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
		
		System.out.println();
		System.out.println("---2nd Way---");
		String [] name= {"Ahmad", "Alex", "Angelo", "Bryan", "Gul", "Korkmaz", "Stephanie", "Tolga"};
		System.out.println(name [6]);
		
		
		//HOW TO GET ALL ELEMENTS FROM AN ARRAY
		System.out.println();
		System.out.println("---All Elements from an array---");
		for (int i=0; i<names.length; i++) {
			
			System.out.print(names[i]+ " ");
		}
		

	}

}
