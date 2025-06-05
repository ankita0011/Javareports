package constructor;

public class SuperEx extends ClassParent{


	
	public SuperEx() {
		super("Jai");
		System.out.println("Child Constructor");
		
	}
	public SuperEx(String naam) {
		super("Aman");
		name =naam;	
		System.out.println("String Parameterized child constructor");
		
	}
	
	public SuperEx(String naam,int Agee) {
		super("tarun");
		name =naam;
		age = Agee;
	}
	
	String name;
	int age;
	
	public static void main (String[] args) {
		SuperEx su = new SuperEx("Chandan");
		
	}
}
