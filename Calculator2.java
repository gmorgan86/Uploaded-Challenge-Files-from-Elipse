package com.qa.helloworld;

public class Calculator2 {

	public static void addition(int num1, int num2) {
		int answer = num1+num2;
		System.out.println(answer);
	}
	
	public static void minus(int num1, int num2) {
		int answer = num1-num2;
		System.out.println(answer);
	}
	
	public static void multiply(int num1, int num2) {
		int answer = num1*num2;
		System.out.println(answer);
	}
	
	public static void divide(double num1, double num2) {
		double answer = num1/num2;
		if (num1<num2) {
			System.out.println(answer);
		}
		else {
			System.out.println("Division cannot be performed");
		}
	}
	
	
	public static void main(String[] args) {
		addition(5,8);
		minus(1,2);
		multiply(3,4);
		divide(5,10);
	}
}
