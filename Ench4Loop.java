package com.qa.helloworld;

import java.util.ArrayList;
import java.util.List;

public class Ench4Loop {
	
	public static boolean returnSomething(int numbers) {    //exercise 3
		if(numbers%2==0){
			System.out.println(numbers + " True");
			return true;
			
		
		}else {
			System.out.println(numbers + " False");
			return false;
		}
	}

	public static void main(String[] args) {
		
//		List<String> names = new ArrayList<>();	
//		
//		names.add("Pete");
//		names.add("Kate");
//		names.add("Gareth");
//		names.add("Helen");
//		names.add("Josh");
//		names.add("Sarah");
//		names.add("Jenny");
//		
//		for (String name : names) {
//			System.out.println(name);
//		}
//		
		
		int[] numbers = { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

		
//		for (int num : numbers) {
//			System.out.println(num);      //exercise 2
//		
//			System.out.println(num*num);
//		}
		 
		for (int i : numbers) {   //exercise 4
			if(returnSomething(i)) {
				System.out.println(" Even: " +  i * i * i);
			} else {
				System.out.println(" Odd: " + i * i);
			}
		}
			}
	
		

		
	}
	

