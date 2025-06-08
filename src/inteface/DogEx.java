package inteface;

public class DogEx implements Animal{

	@Override
	public void sound() {
		System.out.println("Bhaow");
		
	}

	@Override
	public void bark() {
		System.out.println("Dog barks");
		
	}

	@Override
	public void roar() {
		System.out.println("Dog Roars");
		
	}

	@Override
	public void eat() {
		System.out.println("Dog eats");
		
	}

}
