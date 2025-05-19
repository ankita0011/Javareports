package inheritance;

public class Animal1 {
	void eat() {
		System.out.println("this animal eats food");
	}

	class Dog extends Animal{
	void bark() {
		System.out.println("this Dog barks");
	}

	
		public static void main(String[] args) {
			Dog d = new Dog();
			d.eat();
			d.bark();

	}
		
	}
	}


		

