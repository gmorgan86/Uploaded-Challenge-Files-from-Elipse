package com.qa.helloworld;

public class UniqueSum {

	public static void unique(int num1, int num2, int num3) {
		if(num1!=num2 && num1!=num3 && num2!=num3) {
			System.out.println(num1+num2+num3);
		}
		else if(num1!=num2 && num1!=num3 && num2==num3) {
			System.out.println(num1);
		}else if(num1!=num2 && num1==num3 && num2!=num3) {
			System.out.println(num2);
		}else if(num1==num2 && num1!=num3 && num2!=num3) {
			System.out.println(num3);
		}
		else if(num1!=num2) {
			System.out.println(num1+num2);
		}else if(num1!=num3) {
			System.out.println(num1+num3);
		}else if(num2!=num3) {
				System.out.println(num2+num3);
		}else {
			System.out.println("All the numbers are the same");
		}
	}
	
	
	public static void main(String[] args) {
		unique(1,3,4);
	}
}
