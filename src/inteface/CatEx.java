package inteface;

public class CatEx implements Animal{

	@Override
	public void sound() {
		System.out.println("Meow");
		
	}

	@Override
	public void bark() {
		System.out.println("Cat barks");
		
	}

	@Override
	public void roar() {
		System.out.println("Cat roars");
		
	}

	@Override
	public void eat() {
		System.out.println("Cat eats");
		
	}

}
