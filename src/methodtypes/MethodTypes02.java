package methodtypes;

public class MethodTypes02 {

	public void add() {
		System.out.println(20 + 10);
	}

	public int addTwoNumbers(int a, int b) {
		int c = a + b;
		return c;

	}

	public String getcity() {
		return "Jaipur";

	}

	public static void main(String[] args) {
		MethodTypes02 mt = new MethodTypes02();
		mt.add();

		int number = mt.addTwoNumbers(20, 10);
		System.out.println("number is " + number);

		String mycity = mt.getcity();
		System.out.println("city is" + mycity);

	}

}
