package Pets;

public class Dog extends Pet{

	@Override
	public void doThing() {
		System.out.println("I own a dog");
	}
	
	@Override
	public void makeNoise() {
		System.out.println("Woof");
	}
	
	@Override
	public void doIFly() {
		System.out.println(this.isFly());
	}
}
