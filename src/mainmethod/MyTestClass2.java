package mainmethod;

public class MyTestClass2 {

	public static void main(String[] args) {

		int marks = 82;

		if (marks >= 90) {
			System.out.println("Grade A");
		} else if (marks >= 75) {
			System.out.println("Grade B");
		} else if (marks >= 60) {
			System.out.println("Grade C");
		} else {
			System.out.println("Grade D or Fail");
		}

		int temp = 32;

		if (temp >= 40) {
			System.out.println("Very hot");
		} else if (temp >= 30) {
			System.out.println("hot");
		} else if (temp >= 20) {
			System.out.println("Warm");
		} else {
			System.out.println("cold");
		}

		int num = 0;

		if (num > 0) {
			System.out.println("number is positive");
		} else if (num < 0) {
			System.out.println("number is negative");
		} else {
			System.out.println("Zero");
		}

		int attempts = 3;

		if (attempts == 1) {
			System.out.println("First attempts");
		} else if (attempts == 2) {
			System.out.println("Second attempts");
		} else if (attempts == 3) {
			System.out.println("third attempts");
		}
		int number = 15;

		if (number > 10) {
			System.out.println("the number is greater than 10");
			if (number % 3 == 0) {
				System.out.println("the number is divisibale by 3");

			}
		}
	}
}
