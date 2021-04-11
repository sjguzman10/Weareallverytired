package com.class17;

//Local variable examples

/*
 * Declared inside a method, constructor or any block of code
 */

public class LocalVariableDemo2 {
	//Inside class
	
	void printInfo(String name) { //Yes local variable - inside class and exception with this method (tricky) because behavior is the same 
		String phoneNumber="123456789";
		System.out.println(name);
	}
	
	void printInfoWtihAddress(String name, String address) {
		System.out.println(name+address);
		//System.out.println(phoneNumber); NOT LOCAL = NOT ACCESSIBLE, will show error
	}
	

	public static void main(String[] args) {
		// Inside method 
		
		String name1="Local";//yes because inside class and method 
		
		//System.out.println(name); NOT LOCAL VARIABLE- NOT ACCESSIBLE, will show error
		
		//also local variable below 
		for (int i=0; i<5; i++) { //local since accessible in the ()
			System.out.println(i);
		}
		// System.out.println(i); NOT LOCAL VARIABLE- NOT ACCESSIBLE, will show error
		
		
		//Another example
		{
			int x=10;
			{
				int y=20;
				System.out.println(x); //LOCAL yes 
			}
			//System.out.println(y); NOT LOCAL VARIABLE- NOT ACCESSIBLE, will show error
			
		}

	}

}
