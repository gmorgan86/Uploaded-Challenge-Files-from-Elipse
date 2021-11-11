package com.qa.helloworld;

import java.security.PublicKey;

public class Itteration {

	
	public static void main(String[] args) throws InterruptedException {
//		simpleWhileLoop();
//		doWhileLoop();
//		forLoop();
//		nestedForLoop();
//		controlStatements();
	}
		
	
	
	
	public static void controlStatements() {
		//break, continue
		//- break will stop the loop, i.e it will break out of it
		// - continue will skip to the next itertion of the loop
		for (int i=0; i<=100; i++) {
			if (i%10==0) {
				continue;  //skips 10,20,30,40 etc up to 100
			}
			
			if (i==93) {
				break;    //stops at 92
			}
			System.out.println(i);
		}
		//the break statement forces control to return here
	}
	
	
	public static void nestedForLoop() {
		//a nested for loop is a loop within a loop
		int targetTimesTable =10;
		int targetCount =12;
		for (int table=1; table<=targetTimesTable; table++) {  //outer
			System.out.println("Times table for: " + table);
			for(int count=1; count<=targetCount; count++) {  //inner
//				System.out.println("Outer Loop: " + table);
//				System.out.println("Inner Loop: "+ count);
				
				System.out.println(table + " x " + count + " = " + (table*count));
		}
		}	
		}
	
	
	
	
	public static void forLoop() {
		
	for (int counter=0; counter<=10; counter++) {
		//only print even numbers
		if (counter % 2==0) {
		System.out.println(counter);
	}
	}	
	}
	
//	public static void doWhileLoop(){ //almost the same as a while loop, except it will run at least once
//		boolean inPlay=false;
//		String prompt ="> ";
//		do {
//			System.out.println("Play  Exit");
//			System.out.println(prompt);
//			String input ="Exit";
//			if(input=="Exit") {
//				inPlay =false;
//			}
//			
//		}while (inPlay==true);
//	}
		
		
	
		
//	public static void simpleWhileLoop() {  //while loops use a boolean expression, 
//		boolean inPlay=true;
//		int i=3;
//		
//		while (inPlay=true) {
//			if(i>=10) {
//				inPlay =false;
//			}
//			System.out.println(i);
//			i++;
//		}
//	}
	}

