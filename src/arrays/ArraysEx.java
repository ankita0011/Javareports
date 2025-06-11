package arrays;

public class ArraysEx {

	public static void main(String[] args) {
		
		int[] numbers ;
		
		
		int[] num = {2,23,33,22,44,33};
		
		int[] ages = new int[4]; 
		
		ages [0] = 45;
		ages[1] = 33;
		ages [2] = 44;
		ages [3] = 77;
		
		System.out.println(ages [2]);
		System.out.println(num[3]);
		
		for (int x =0 ;x < num .length ; x++) {
			System.out.println(num[x]);
		}
		
		System.out.println("=============");
		
		for(int x: num){
		System.out.println(x);
		}
		
		System.out.println("=========");
		
		String[] name = {"chandan","naman","rajat","pavan"};
		
		for (String Firstname : name) {
			System.out.println(Firstname);
		}
	}

}
