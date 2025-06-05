package testpackage;

public class StaticNonStatic {
	
	public void greet() {
		System.out.println("HEllo kitty");
	}

	public static void behave() {
		System.out.println("Behave properly");
		StaticNonStatic refvar2 = new StaticNonStatic();
		refvar2.greet();
		refvar2.obey();
		
		
	}
	
	public void treats() {
		System.out.println("Treat people in good manner");
	}
	
	public static void main(String[] args) {
		behave();
		StaticNonStatic refvar = new  StaticNonStatic();
		refvar.treats();
		
		
	}
	
	public void obey() {
		System.out.println("obey your elders");
	}
}
