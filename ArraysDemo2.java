package com.qa.helloworld;

public class ArraysDemo2 {
	
	
public static void main(String[] args) {
	
	int[][] ageArray = { {25,30,31},{56,67,39},{8,1,2} };  
	String[][] nameArray = new String[3][2];
	nameArray[1][1]="John";
	nameArray[0][0]="Jordan";
	
	
	//FOR EACH 
	for (int[] array : ageArray) {
		for(int value: array) {
			System.out.println(value);  //prints values of ageArray
		}
		
	}
	
//	//FOR LOOP 
//	for(int i=0; i<ageArray.length; i++) {
//		for(int j=0; j <ageArray[i].length; j++) {
//			System.out.println(ageArray[i][j]) ;  //prints values of ageArray
//		}
//	}
//}
}}
