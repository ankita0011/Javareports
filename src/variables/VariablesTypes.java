package variables;

public class VariablesTypes {

	// static
	// instance
	// local

	// instance variable
	String name = "Aman";

	// static variable (class)
	static String air = "Polluted";

	public void test() {
		int num;
		String naam = "Neha";
		System.out.println(naam);

	}

	public void mytest() {
		System.out.println(name);

	}

	public static void teststatic() {
		VariablesTypes vt = new VariablesTypes();
		System.out.println(vt.name);
	}
}
