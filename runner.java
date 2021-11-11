package Pets;

public class runner {

	public static void main(String[] args) {
		
		Cat cat =new Cat();
		Dog dog = new Dog();
		Pet pet = new Pet();
		
//		pet.doThing();
//		cat.doThing();
//		dog.doThing();
//		pet.makeNoise();
//		cat.makeNoise();
//		dog.makeNoise();
		pet.doIFly();
		cat.setFly(false);
		cat.doIFly();
		dog.doIFly();
	}
	
	
}
