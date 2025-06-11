package arrays;

public class Array1 {

	public static void main(String [] args) {
		String[] Fruits = new String [3];
		
		Fruits [0] = ("apple");
		Fruits [1]= ("grapes");
		Fruits [2]= ("oranges");
		
		for (String x :Fruits ) {
			System.out.println(x);
		}
		
		System.out.println("=========");
		
		String [] Fruit1 = {"apple","Mango","oranges"};
		
		for(String X1 : Fruit1) {
		System.out.println(X1);
		}
	}
}
