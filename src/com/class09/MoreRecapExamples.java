package com.class09;

public class MoreRecapExamples {

	public static void main(String[] args) {
		System.out.println("---Car Odomoter---");
		for (int a=0; a<=9; a++) {
			
			for (int b=0; b<=0; b++) {
				
				for (int c=0; c<=0; c++) {
					
					for (int d=0; d<=0; d++) {
						
						System.out.println(a+" "+b+" "+c+" "+d);
					}
				}
			}
		}
		
		System.out.println("-----Clock----");
		
		for (int h=0; h<=23; h++) {
			
			for (int m=0; m<=59; m++) {
				
				if (h<10 && m<10)
				{
					System.out.println("0"+h+":0"+m);
				}
				else if (h<10 && m>=10) {
					System.out.println("0"+h+":"+m);
				}
				else if (h>=10 && m<10) {
					System.out.println(h+":0"+m);
				}
				else {
					System.out.println(h+":"+m);
				}
			}
		}
		
		System.out.println("-----Multiplicaiton Table-------");
		
		int result;
		
		for (int a=1; a<=9; a++) {
			for (int b=1; b<=9; b++) {
				result=a*b;
				System.out.println(a+" * " +b+ " = " +result);
			}
		}

	}

}
