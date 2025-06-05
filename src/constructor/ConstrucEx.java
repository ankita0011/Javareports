package constructor;

public class ConstrucEx {
	
	public ConstrucEx(String naam){
		name = naam;
		
	}
	public ConstrucEx() {
		name = "ramesh";
	}
	
	String name;
	public static void main (String[] args) {
		
		ConstrucEx cr = new ConstrucEx("Aman");
		System.out.println("Parameterized constructor:" + cr.name);
		ConstrucEx cr1 = new ConstrucEx("rajat");
		System.out.println("paramaterized constructor:" + cr1.name);
		ConstrucEx cr2 = new ConstrucEx();
		System.out.println("Non parametrized constructor:" +cr2.name);
		
	}

}
