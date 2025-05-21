package access;

public class ClassA {

	String name = "Aman";
	static String air = "Polluted";

	public void getJob() {
		System.out.println("works in delhi");

	}

	public static void getair() {
		System.out.println("environment is polluted");
	}

	public static void main(String[] args) {
		getair();

		ClassA Vari = new ClassA();
		Vari.getJob();
		System.out.println(Vari.name);

	}

}