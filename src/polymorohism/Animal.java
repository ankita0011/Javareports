package polymorohism;

public class Animal {

	void sound() {
		System.out.println("Animal makes a sound");

	}

	String color;
	int age;

	public void jump() {
		System.out.println("Animal jumped");
	}

	public void eat() {
		System.out.println("Animal eats");
	}

	public void sleep() {
		System.out.println("Animal sleep");
	}

	public static void main(String[] args) {
		Animal ani = new Dog();
		ani.eat();
		Printer pr = new Printer();
		pr.print(56);

	}
}

	class Printer {
	void print(String text) {
		System.out.println("Printing text : " + text);

	}

	void print(int number) {
		System.out.println("Printing number : " + number);

	}

	void print(double number) {
		System.out.println("Printing decimal: " + number);

	}
}
