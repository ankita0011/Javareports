package AbsEx;

public class Glare extends AbsTestClass{
	
	public Glare (int x) {
		super(x);
	}

	public void test() {
		System.out.println("Glare implements method");
	}
	public static void main (String[] args) {
		
		Glare g1 = new Glare(12);
		System.out.println(g1.size);
		
	}
	
		
	}
	

