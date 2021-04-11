package com.class17;

public class StringBuilderVsString2 {

	public static void main(String[] args) {
		
		//All objects contains same info; all items in computer will be scanned 
		String var1="Steph";
		String var2="Steph";
		String var3="Steph";
		String var4="Steph";
		var4="Ram"; //now changed to Ram 
		
		//Different objects/variables contain different values, 
		//this can be super slow in computer since it will have to scan every single value 
		String v1="Steph";
		String v2="Karen";
		String v3="Silvia";
		String v4="Edgar"; //PREFERRED WAY 
		String v5=new String ("Wenny"); //In this approach, 2 objects are created. try to avoid this way. 
		v4="Dodge";
		
		//if we know our data will be changing like above, we do NOT have to use the same class
		
		//NO MEMORY SCANS for String Builder 
		StringBuilder sb1=new StringBuilder("Steph");
		StringBuilder sb2=new StringBuilder("Karen");
		StringBuilder sb3=new StringBuilder("Silvia");
		StringBuilder sb4=new StringBuilder("Edgar");
		
		System.out.println(sb1.reverse());
		System.out.println(sb1);
		
		//How to pass a String to String Builder object 
		//Two Ways
		StringBuilder sb5=new StringBuilder(var1); //Way One
		System.out.println(var1); 
		var1=sb5.toString(); //Way Two 
		System.out.println(var1);
		

	}

}
