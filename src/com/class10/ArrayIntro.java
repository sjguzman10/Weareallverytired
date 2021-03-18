package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		//
		System.out.println("-------Not Arrarys Review--------");
		
		int num=10;
		num=20;
		System.out.println(num);
		
		System.out.println("------Array with numerical values-----");
		
		//creating an array of integers
		int [] array=new int[5];
		//take my variable to the index and place 10 inside 
		array[0]=10;
		array [1]=12;
		array [2]=15;
		array [3]=9;
		array [4]=13;
		
		System.out.println(array[0] + array[4]);
		
		//compiler helps auto to print 
		//ARRAYS ARE FIXED - in size and how much it holds i.e. int & double 
		double [] numbers=new double [2];
		numbers [0]=10;
		numbers [1]=19.01;
		
		numbers [0]=11.99;
		System.out.println(numbers[0]);
		
		System.out.println("-----Array with strings-------");
		
		String [] names=new String [3];
		names [0]="Jahanzeb";
		names [1]="Ozoda";
		names [2]="Alec";
		
		System.out.println(names [2]);
		
		//auto-null when empty index
		//extra storage index won't be in execution although compiler will not complain 
		
		int [] nums=new int[3]; //PREFERRED WAY 
		System.out.println(nums [1]); //if no values stored, compiler adds default values to the array
		
		boolean b[]=new boolean [3];
		b [0]=true;
		b [1]=true;
		b [2]=false;
		System.out.println(b[2]);
		
		//What is the size of my array?
		//Length = specify how many times the loop runs
		int size=b.length; //this will always be on this side
		System.out.println("The size of my array is "+size);

	}

}
