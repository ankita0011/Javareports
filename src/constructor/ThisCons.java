package constructor;

public class ThisCons {

	public ThisCons() {
		this("Maman",23);
	}

	public ThisCons(String word) {
		name = word;
	}

	public ThisCons(String word, int agee) {
		name = word;
		age = agee;
	}

	String name;
	int age;

	public static void main(String[] args) {
		ThisCons th = new ThisCons();
		System.out.println(th.name);
		System.out.println(th.age);

	}
}
