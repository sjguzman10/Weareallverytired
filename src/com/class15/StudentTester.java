package com.class15;

public class StudentTester {

	public static void main(String[] args) {
		
		 //Creating objects from Student Class NOT class here 
		
		
		//Step 1 new object, Step 2 assigning it to name of class and  Step 3 (); 
		//Step 4 name object i.e.ramObj , Step 5 assign value to that variable
		Student ramObj=new Student();
		ramObj.name="Ram";
		ramObj.age=25;
		ramObj.studentID="CS123";
		ramObj.schoolName="Syntax";
		ramObj.study();
		ramObj.payTuition();
		
		Student sjgObj=new Student();
		sjgObj.name="Stephanie";
		sjgObj.age=31;
		sjgObj.studentID="CS456";
		sjgObj.schoolName="Syntax";
		sjgObj.study();
		sjgObj.payTuition();
		System.out.println(sjgObj.getStudentAge()); //printing age 
		

	}

}
