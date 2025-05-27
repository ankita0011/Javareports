package inheritance;

public class Animal {

	String Colour;
	int age;

	public void jump() {
		System.out.println("Animal Jump");
	}

	public void eat() {
		System.out.println("Animal Eat");
	}

	public void sleep() {
		System.out.println("Animal Sleep");
	}

	class dog extends Animal {
		void bark() {
			System.out.println("Barking");

		}
	}

	}

