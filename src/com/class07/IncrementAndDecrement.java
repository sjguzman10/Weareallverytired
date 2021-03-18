package com.class07;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		
		int z=10;
		z=z+1; //traditional arithmatic operator 
		
		z+=1; //shorthand operator
		System.out.println(z);
		z++; //INCREMENT OP --> adds 1 to the variable 
		
		System.out.println(z);
		
		int x=20;
		x-=1;
		x--; //DECREMENT OP --> subtract 1 from the variable ; uses 2 dashes
		
		System.out.println(x);
		
		//100++; CANNOT USE WITH VALUES 
		// increment and decrement ops can be used ONLY with variables 

	}

}
