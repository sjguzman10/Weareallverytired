package com.repl.task086to105;

class Task086 { //PASSED

		/*
		 * Create a class 'Main' (please do not make it public as Repl will give you an error)
		 * Inside class declare a String variable 'name' and integer variable 'roll_no'. 
		 * Create an object of the class and assign the value of 2 to roll_no and value of "John" to name
		 * 
		 * Your program should print the following OUPUT:
		 * Name is John and roll number is 2
		 */
		
		String name;
		int roll_no;
		void nameis() {
			System.out.print("Name is " +name);
		}
		
		void rollNumis() {
			System.out.print(" and roll number is " + roll_no);
		}
		
		public static void main(String []args) {
		
		Task086 obj=new Task086();
		obj.name="John";
		obj.nameis();
		obj.roll_no=2;
		obj.rollNumis();
		}
}
