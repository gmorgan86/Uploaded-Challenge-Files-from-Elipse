package com.qa.helloworld;

public class Calculator {
public static void main(String[] args) {
	addition();
	minus();
	multiply();
	divide();
}

public static void addition() {
	int num1=3;
	int num2=5;
	int result=num1+num2;
	
	
	System.out.println(result);
}
public static void minus() {
	int num1=3;
	int num2=5;
	int result=num1-num2;
	
	
	System.out.println(result);
}
public static void multiply() {
	int num1=3;
	int num2=5;
	int result=num1*num2;
	
	
	System.out.println(result);
}
public static void divide() {
	double num1=3;
	double num2=5;
	double result=num1/num2;
	
	
	System.out.println(result);
}

}
