package polymorohism;

public class Dog extends Animal {

	public void bark() {
		System.out.println("Dog Barks");
	}

	public void bark(String word) {
		System.out.println("Dog Barks");
	}

	public void bark(int word) {
		System.out.println("Dog Barks");
	}

	public void bark(String abc, int word) {
		System.out.println("Dog Barks");
	}

	public void eat() {
		System.out.println("Dog eats");
	}

	public void bark(int abc, String word) {
		System.out.println("Dog Barks");
		bark();
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark("bow wow");
		Animal ani = new Dog();
		ani.sound();
		shape sh = new circle();
		sh.draw();

	}

	void sound() {
		System.out.println("Dog barks");
	}

}

class shape {
	void draw() {
		System.out.println("Drawing a shape");

	}
}

class circle extends shape {
	void draw() {
		System.out.println("Drawing a circle");
	}

}
