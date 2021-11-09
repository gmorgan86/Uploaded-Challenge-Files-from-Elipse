package com.qa.helloworld;

public class Runner {

	
	public static void main(String[] args) {
		
		Person gareth = new Person("Gareth", 30, 192, 12, "Accountant");
		Person zoe = new Person("Zoe", 32, 169, 4, "Blacksmith");
		Person emma = new Person("Emma", 29, 174, 16, "Vet");
		Person bill = new Person("Bill", 56, 182, 10, "Doctor");
		Person john =  new Person("John", 200);
		
		gareth.greet();
		zoe.greet();
		emma.greet();
		bill.greet();
		john.suit();
		

	}
}
