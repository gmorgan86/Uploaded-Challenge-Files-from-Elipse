package com.qa.encapsulationexercise;

public class encapsulationexercise {

	private String name;
	private int age;
	private double price;
	private float order;
	private long serial;
	
	public encapsulationexercise(String name, int age, double price, float order, long serial) {
		this.name = name;
		this.age = age;
		this.price = price;
		this.order = order;
		this.serial = serial;
	}
	

	public encapsulationexercise() {
		super();
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public float getOrder() {
		return order;
	}

	public void setOrder(float order) {
		this.order = order;
	}

	public long getSerial() {
		return serial;
	}

	public void setSerial(long serial) {
		this.serial = serial;
	}


	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + ", price=" + price + ", order=" + order
				+ ", serial=" + serial + "]";
	}


	
	
	
	
}
