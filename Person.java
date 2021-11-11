package com.qa.helloworld;

public class Person {

	private String name;
	private int age;
	private double height;
	private int shoesize;
	private String jobtitle;

	public Person(String name, int age, double height, int shoesize, String jobtitle) {
		this.name =name;
		this.age =age;
		this.height = height;
		this.shoesize =shoesize;
		this.jobtitle =jobtitle;
		}
	
	public Person(String name, int height) {
		this.name =name;
		this.height = height; 
	}
	
	public void greet() {
		System.out.println("Hi I'm " + name + ", I'm "+ age + " years old, " + "I am " + height + "cm"+ " and I have size " + shoesize + " feet." + " I am a " + jobtitle + "." );
	}
	
	public void suit() {
		System.out.println("My name is "+ name + " and I need a suit for my " + height+ "cm.");
	}
	
	
}
