package com.class15;

public class ContainsDemo {

	public static void main(String[] args) {
		// CONTAIN VS STARTS WITH 
		
		String var="This is a demo of contain #";
		System.out.println(var.contains("#"));
		if (var.contains("#")) {
			System.out.println("# are not allowed");
			}
		
		System.out.println(var.contains("demo"));
		
		System.out.println(var.startsWith("This is a demo"));

	}

}
