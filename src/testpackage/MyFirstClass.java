package testpackage;

public class MyFirstClass {

	// noun;
	String hands;
	int age;

	// verbs
	public static void clap() {
		System.out.println("hands move");
		System.out.println("hands move on the right");
		// ClassName nameofReferenceVariable = new ClassName();
		MyFirstClass reftum = new MyFirstClass();
		reftum.run();

	}

	public void run() {
		System.out.println("leg moves");
		walk();
	}

	public void walk() {
		System.out.println("feet moves");

	}

	public static void main(String[] args) {
		clap();

		// ClassName nameofReferenceVariable = new ClassName();
		MyFirstClass refVar = new MyFirstClass();
		refVar.run();

	}

}
