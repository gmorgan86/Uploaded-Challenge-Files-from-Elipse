package com.qa.helloworld;

public class FizzBuzz {

	
	public static void fizz(int num1) {
		if(num1%3==0 && num1%5==0) {
			System.out.println("Fizzbuzz");
		}else if (num1%5==0) {
			System.out.println("Buzz");
		}else if (num1%3==0) {
			System.out.println("Fizz");
		}else {
			System.out.println(num1);
		}
	
	}
	
	public static void main(String[] args) {
		fizz(15);
	}
}
