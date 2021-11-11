package com.qa.helloworld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
	
public static void main(String[] args) {
	
	List<String> names = new ArrayList<>();
	
//	ArrayList<String> names2= new ArrayList<>(); 
	
	names.add("Zayn");
	names.add("James");
	names.add("John");
	names.add("Bill");
	names.add("Eve");
	names.add("Jack");
	
	System.out.println(names);
	System.out.println(names.get(1));
	
	names.set(1, "Patel");
	System.out.println(names);
	Collections.sort(names);
	System.out.println(names);
	
	//FOR EACH LOOP (enhanced for loop)
	
//	for(String name : names) {
//		System.out.println(name);   
//	}
//	
//	//FOR LOOP
//	
//	for(int i=0; i<names.size(); i++) {
//		System.out.println(names.get(i));   //same as above
//	}
	
//	Collections.swap(names, 0, 5);   //swaps names in list
//	System.out.println(names);
	
//	Collections.reverse(names);   //reverse
//	System.out.println(names);
	
//	List<String> pets = List.of("cat", "dog", "cow");  //creating lists like this, means we cant amend or add!
	
//	List<String> pets = new ArrayList<>(List.of("cat", "dog", "cow")); //this is better!
//	System.out.println(pets);
	
	
}
}
