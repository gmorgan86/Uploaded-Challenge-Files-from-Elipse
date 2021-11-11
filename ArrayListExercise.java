package com.qa.helloworld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise {
	
private static Object pets2;

public static void main(String[] args) {
	
	List<String> pets =new ArrayList<>();
	
	pets.add("dog");
	pets.add("cat");
	pets.add("bird");
	pets.add("gerbil");
	pets.add("hampster");
	pets.add("cow");
	pets.add("pig");
	pets.add("sheep");
	
//	System.out.println(pets);
	
//	for(int i=0; i<pets.size(); i++) {
//		System.out.println(pets.get(i));
//	}
	
//	for (String pet : pets) {
//		System.out.println(pet);
//	}
	
	
//	System.out.println(pets.get(2));
//	System.out.println();
//	pets.set(7, "emu");
//	System.out.println(pets);
//	pets.remove(2);
//	System.out.println(pets);
	pets.clone(pets2);
	System.out.println(pets);
	
}
}
