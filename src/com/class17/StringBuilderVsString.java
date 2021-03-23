package com.class17;

public class StringBuilderVsString {

	public static void main(String[] args) {
		// Use proper class based on scenario presented 
		
		String var1="Steph";
		String var2="Karen";
		String var3="Silvia";
		String var4="Egg";
		String var5=new String("Wenny"); //NOT RECOMMENDED TO USE  
		var4="Dodgie";
		
		StringBuilder sb1=new StringBuilder("Steph");
		StringBuilder sb2=new StringBuilder("Karen");
		StringBuilder sb3=new StringBuilder("Silvia");
		StringBuilder sb4=new StringBuilder("Egg");
		StringBuilder sb5=new StringBuilder("Dodgie");
		
		//System.out.println(sb1.reverse());
		
		//var1=sb1.toString(); //converting to StringBuilder 
		
		System.out.println(var1);

	}

}
