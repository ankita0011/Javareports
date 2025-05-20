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

	class Cat extends Animal {
		void meow() {
			System.out.println("Mewoing");
		}
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.bark();
		Cat c = new Cat();
		c.eat();
		c.sleep();
	}
}
