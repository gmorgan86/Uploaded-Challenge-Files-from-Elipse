package com.qa.encapsulationexercise;

public class runnerexercise {

	
	public static void main(String[] args) {
		
	
	encapsulationexercise example = new encapsulationexercise();
	encapsulationexercise example1 = new encapsulationexercise();

		example.setName("Gareth");
		example.setAge(25);
		example.setPrice(4.99);
		example.setOrder(1006494f);
		example.setSerial(943648451);
		example1.setName("Ben");
			
		System.out.println(example.getName() + " " + example.getAge());
//		System.out.println(example.getAge());
		System.out.println(example.getPrice());
		System.out.println(example.getOrder());
		System.out.println(example.getSerial());	
		System.out.println(example1.getName());
		System.out.println(example);
		
}
}