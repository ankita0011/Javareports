package methodtypes;

public class MethodTypes01 {

	// Non parameterized
	public void add() {
		System.out.println(20 + 30);

	}

	// parameterized method
	public void substract(int a, int b) {

		System.out.println(a - b);
	}

	public void getCity(String city) {
		System.out.println(city);
	}

	public static void main(String[] args) {
		MethodTypes01 mt = new MethodTypes01();
		mt.add();
		mt.substract(15, 10);// argument
		mt.getCity("Jaipur");// argument
		mt.sayHello("Raman");

	}
    //Chat gpt eg

	void sayHello(String name) {
		System.out.println("Hello," + name);

	}
}
