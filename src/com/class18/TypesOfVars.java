package com.class18;

public class TypesOfVars {
	
	String name;
	static String CompanyName="Syntax";
	
	//Can access instance and static vars here 
	void printInfo() {
		System.out.println(name + "Company: "+CompanyName);
	}
	
	static void printCompanyInfo() {
		//System.out.println(name); Will not work here since String name is instance variable 
		System.out.println(CompanyName);
	}

	public static void main(String[] args) {
		
		TypesOfVars obj1=new TypesOfVars();
		obj1.name="Ram";
		
		TypesOfVars obj2=new TypesOfVars();
		obj2.name="Aiman";
		
		TypesOfVars.printCompanyInfo();//calling it directly 

	}

}
