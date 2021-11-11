package com.qa.helloworld;

public class ArrayDemo3 {
	
public static void main(String[] args) {
	long[] ageArray = {25,6,7};
	int[] numArray = new int [6];
	long[] examResults = {90,100,88,70,40,55,64,84,78,99};
	int[] examResults1 =new int[7];
	int[] newExamResults=new int[6];
	
	examResults1[0]=100;
	examResults1[1]=90;
	examResults1[2]=80;
	examResults1[3]=70;
	examResults1[4]=60;
	examResults1[5]=50;
	examResults1[6]=40;
	
//	for (int exam : examResults1) {
//		System.out.println(exam);
//	}
	for (int i=0; i<examResults1.length; i++) {
		examResults1[i]=examResults1[i]*10;
		System.out.println(examResults1[i]);   //multiplies value in arrays by 10 and changes value
	}
	
	//FOR EACH LOOP
	
//	for(long age : ageArray) {
//		System.out.println(age);   //will print contents of ageArray
//	}
	
	
	
	
//	for(long age :ageArray) {
//		if (age%2==0) {
//			System.out.println(age);
//		}else {
//			System.out.println("Hello");  //if age is divisable by 2 it will print age. if not- hello
//		}
//	}
	
	
	
	
	//FOR LOOP
	
//	for(int i=0; i<ageArray.length; i++) {
//		System.out.println(ageArray[i]);  //will print contents of ageArray
//	}
//	
	
//	for (long results : examResults) {
//		System.out.println(results);
//	}
	
	
	
}
}
