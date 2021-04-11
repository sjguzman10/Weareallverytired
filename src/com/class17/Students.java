package com.class17;

public class Students {
	
	/*
	 * Create a class called Students
	 * Create 3 variables studentName, studentID, and numberOfStudents
	 * Create 3 objects of the Students Class 
	 * Set the value for studentName, studentID, and increment the numberOfStudents for each object
	 * Print out the total number of students 
	 */
	
	//STEP 1
	String studentName; //different info, so make instance
	String studentID; //different info, so make instance
	static int numberOfStudents; //accessible and same across objects, so make static 

	public static void main(String[] args) {
	//STEP 2
		Students StephObj=new Students();
		
	//STEP 3	
		StephObj.studentName="Stephanie";
		StephObj.studentID="12345";
		StephObj.numberOfStudents++;
		System.out.println(StephObj.studentID+ " name: "+ StephObj.studentName + ". Number of students: " + StephObj.numberOfStudents);
		
		Students KarenObj=new Students();
		KarenObj.studentName="Karen";
		KarenObj.studentID="67890";
		KarenObj.numberOfStudents++;
		System.out.println(KarenObj.studentID+ " name: "+ KarenObj.studentName + ". Number of students: " + KarenObj.numberOfStudents);
		
		Students obj3=new Students();
		System.out.println(StephObj.numberOfStudents); //prints total still since its static! 

	}

}
