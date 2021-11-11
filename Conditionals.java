package com.qa.helloworld;

public class Conditionals {
	
	public static void main(String[] args) {
		
	numberIsGreaterThan(6, "Dan");
}
	
	public static void numberIsGreaterThan(int num, String name) {
		
		//print out "hello" if num is greater than 2
		
		if (num>5 && name.equals("Dan")) {
			System.out.println("Hello");
		}
		else if (num>7){
			System.out.println("Friends");
		}
		else {
			System.out.println("Bye");
		}
		
	}
}
