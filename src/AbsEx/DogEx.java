package AbsEx;

public class DogEx extends AbstractEx{

	@Override
	public void makeSound() {
		System.out.println("Woof");
		}
		
		public DogEx(String name) {
			super(name);
			System .out.println("Dog Barks");
		}
		
		public static void main (String [] args) {
			DogEx dog = new DogEx("Buddy");
			dog.makeSound();
			dog.Sleep();
		}
		
	}


