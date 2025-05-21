package mainmethod;

public class Loops {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}

		for (int i = 2; i <= 10; i += 2) {
			System.out.println(i);
		}
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("sum : " + sum);

		for (int i = 5; i >= 1; i--) {
			System.out.println(i);
		}

		int k = 0;
		while (k <= 10) {
			int c = 23 + 44;
			System.out.println(k);
			k++;

		}
	}

	int j = 0;
	{
		do {
			int c = 23 + 44;
			System.out.println(j);
			j++;
		} while (j < 10);

	}

}
