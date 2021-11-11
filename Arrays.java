package com.qa.helloworld;

public class Arrays {

	
	public static void main(String[] args) {
		
		//three methods...
		int[] ageArray = {18,26,20,100,12,6,15};
		long[] ageArray2 = new long[6]; //new array to store 6 values
		String[] nameArray = {"John", "Emma", "Alex", "Rachael"};
		
		//how to make changes to arrays...
		ageArray2[0]=15;
		nameArray[0]="Angelica";
		
		//FOR LOOP
		
		for(int i=0; i<ageArray.length; i++) {
			System.out.println(ageArray[i]); //will print the values in ageArray (18,26,20,100 etc)
			}
			
		//FOR-EACH LOOP (enhanced for loop)
		
		for (String name : nameArray) {
			System.out.println(name);  //prints contents of nameArray (Johm, Emma etc)
		}
		
		for (int age : ageArray) {
			System.out.println(age); //prints contents of ageArray (18,26,20...)
		}
		
	}
}
