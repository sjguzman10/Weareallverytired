package com.class14;

public class MoreMethodsTester {

	public static void main(String[] args) {
		// 1. Create object from class
		
		MoreMethodExamples moreMethodExamples=new MoreMethodExamples();
		
		// 2. Name of the method 
		//nothing will print if moreMethodsExamples.print since need Sysout
		
		System.out.println(moreMethodExamples.print());
		
		System.out.println(moreMethodExamples.doubleTheValue(10));
		
		moreMethodExamples.isRaining(true);
		//System.out.println(moreMethodExamples.isRaining(true); ERROR since not returning anything
		
		//Print batch 9 is great 5 times
		moreMethodExamples.print5times();
		
		//Print the greater number 
		moreMethodExamples.greaternum(122,56); //does not print, only returns
		System.out.println(moreMethodExamples.greaternum(122,56));
		
		//Print Odd or Even
		moreMethodExamples.evenOrOdd(45);
		
		//Array Sum
		double [] arr= {10.2, 25, 30};
		moreMethodExamples.returnArraySum(arr);
		System.out.println(moreMethodExamples.returnArraySum(arr));
		
		//MirrorString 
		System.out.println(moreMethodExamples.isMirror("aba")); //prints return
		moreMethodExamples.isMirror("abcdef"); //does not print return T or F

}
}
