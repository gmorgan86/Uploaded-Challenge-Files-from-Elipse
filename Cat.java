package Pets;

public class Cat extends Pet{

	@Override
	public void doThing() {
		System.out.println("I own a cat");
	}
	
	@Override
	public void makeNoise() {
		System.out.println("Meow");
	}
	
	@Override
	public void doIFly() {
		System.out.println(this.isFly());
	}
}
