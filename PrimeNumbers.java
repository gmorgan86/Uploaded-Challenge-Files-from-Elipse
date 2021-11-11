package com.qa.helloworld;

public class PrimeNumbers {
	public static void primeNumber(int primenum) {
		if(primenum<=1) {
			System.out.println("This is not a prime number");
		} else if(primenum==2) {
			System.out.println("2 is a prime number");
		} else if (primenum%2==0) {
			System.out.println("This is an even numer so NOT a prime number");
		} else 
			for(int i=3; i<1000; i++) {
				if(primenum% i ==1) {
					System.out.println("This is a prime number");
				}
				else System.out.println("Unknown");
		}
		
		}
		
		
	
	
	
	public static void main(String[] args) {
		primeNumber(9);
	}
}
