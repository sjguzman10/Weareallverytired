package com.class13;

import java.util.Scanner;

public class ObjectsInJava {

	//HOW WE CREATE CLASSES AND OBJECTS 
	
	public static void main(String[] args) {
		//want to create an iPhone
		MobilePhone iPhone=new MobilePhone(); //creating an object within class 
		iPhone.model="iPhone 12";
		iPhone.price=999;
		iPhone.size=6.4;
		iPhone.make="Apple";
		iPhone.color="Black";
		
		//to create a new Samsung phone 
		MobilePhone samsungS21=new MobilePhone();
		samsungS21.model="S21";
		samsungS21.price=800;
		samsungS21.size=6.8;
		samsungS21.make="Samsung";
		samsungS21.color="Phantom Black";
		
		//to create a Nokia
		MobilePhone nokia=new MobilePhone();
		nokia.model="n5.4";
		nokia.price=450;
		nokia.size=5.5;
		nokia.make="Nokia";
		nokia.color="White";
		

	}

}
