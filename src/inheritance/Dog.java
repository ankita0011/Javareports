package inheritance;

public class Dog extends Animal {

	public void bark() {
		System.out.println("Dog Barks");
	}

	public void guard() {
		System.out.println("Dog Guard");
	}
	

	public static void main(String[] args) {
		
		Dog dog = new Dog ();
		dog.bark();
		dog.sleep();
		
		Animal animal =new Animal();
		animal.eat();
		
		Animal ani = new Dog();
		
		//dog dg = new Animal (); not possible
		
		ani.sleep();
		ani.jump();
		Dog d = new Dog();
		d.eat();
		d.bark();
		Animal A=new Dog();
		A.jump();
	
			
		
		}
	
	public void jump() {
		System.out.println("Dog jump");
	}
	
	}

