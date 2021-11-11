package Pets;

public class Pet {

	 private boolean fly =true;
	
	public boolean isFly() {
		return fly;
	}

	public void setFly(boolean fly) {
		this.fly = fly;
	}

	public void makeNoise() {
		System.out.println("Does your pet make noise?");
		}
	
	public void doThing() {
		System.out.println("Do you own a pet?");
	}
	
	public void doIFly() {
		System.out.println("Does your pet fly?");
			}
}
