package stringmethods;

public class StringMethodEx {

	public static void main(String[] args) {
		
		//charAt
		String myStr = "Hello";
		char result = myStr.charAt(0);
		System.out.println(result);
		
		String name = "Alice";
		char result1 = name.charAt(0);
		char result2 = name.charAt(4);
		System.out.println("First:"+ result1);
		System.out.println("Last: "+ result2);
		
		String name1 = "Mitali";
		char Firstchar = name1.charAt(0);
		char Lastchar = name1.charAt(-1);
		System.out.println(Firstchar);
		System.out.println(Lastchar);
		
		//CompareTo
		
		
		

	}

}
