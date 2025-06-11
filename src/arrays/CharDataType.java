package arrays;

public class CharDataType {

	public static void main(String[] args) {
		
		char ch = 'A';
		char num = 65;
		char chr = '6';
		char sp = '@';
		char spa = ' ';
		
		String naam = "ch1an2dan45gu134p4ta";
		
		char[] ch1 = naam.toCharArray();
		
		//for each value of type char in ch array
		for(char x: ch1) {
			//System.out.println(x);
			
			if(Character.isAlphabetic(x)) {
				System.out.println(x);
			}
		}
		
		

	}

}
