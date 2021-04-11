package com.class17;

public class LocalVarsUse {
	
	double salary=120000;
	void printInfo() {
		String name="Stephanie";
		System.out.println(name + " "+ salary);
		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");
	}
	
	void printSalaryPlusBonus() {
		double bonus=50000;
		System.out.println(salary + bonus);
	}

	public static void main(String[] args) {
		// Example of using local variables, when done executing method, memory is freed again 
		
		LocalVarsUse obj=new LocalVarsUse();
		obj.printInfo();
		obj.printSalaryPlusBonus();

	}

}
