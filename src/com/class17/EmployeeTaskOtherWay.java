package com.class17;

public class EmployeeTaskOtherWay {
	
	String empID;
	double salary;
	static String CEO="Sumair"; //STATIC because CEO will be used across whole class
	
	public static void main (String []args) {
		
		EmployeeTaskOtherWay obj1=new EmployeeTaskOtherWay();
		obj1.empID="123";
		obj1.salary=150000;
		System.out.println(obj1.empID+" salary: " +obj1.salary+ " CEO" + obj1.CEO);
		
		

		EmployeeTaskOtherWay obj2=new EmployeeTaskOtherWay();
		obj2.empID="456";
		obj2.salary=180000;
		System.out.println(obj2.empID+" salary: " +obj2.salary+ " CEO" + obj2.CEO);
	}

}
