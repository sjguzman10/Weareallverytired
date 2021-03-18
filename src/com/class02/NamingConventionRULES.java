package com.class02;

public class NamingConventionRULES {

	public static void main(String[] args) {
		
		//keywords - a special word that reserved in Java memory; class, public, static, final, 
		
		//identifiers - name that we give classes, variable and methods
		
		/*
		 * RULES!
		 * 1. DO NOT USE KEYWORDS AS INDENTIFIERS 
		 * 2. Identifiers CANNOT have space
		 * 3. Identifiers CANNOT start with numbers 
		 * 4. Identifiers CANNOT have special characters: ONLY _ OR $  
		 */
		
		//1. int final=10; error; INVALID INDENTIFIER 
		
		//2. byte variable one=12; //RULE 2 CANNOT HAVE SPACE 
		
		//3. short 1b=12; 
		short b1=12; //can add on # ONLY after
		
		//4. long *l=230000; THIS will not work - only ___ and $$ work here *see examples below*
			//long l*=230000;
		
			long _l=200000
			long long_=2000000; 
			
			double $price=12.99;
			double price$=10.99;
			
			
			//NamingConvention (Not JAVA rules but standards used)
				//1. we use camel casing
				//2. classes start with UPPER Cases and follow camel case 
				//3. variables start with LOWER case and follow camel case 
				//4. packages we use lower case and use name as reverse way of URL (i.e. com.google)
				//5. use meaningful way for variables 
			
			int Number=12; //try not to use 
			int number=12; //MORE preferred 
			int numberOne=12; //ok to use 
			int numberTwo=13; //ok to use 
			
			boolean isCold=true; 
			boolean hot=false;
			
			double $applePrice=12.99;
			double mangoPrice=13.89; 
					
	}

}
