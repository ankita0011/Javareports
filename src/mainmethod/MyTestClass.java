package mainmethod;

//simple Boolean variable

public class MyTestClass {
	public static void main(String[] args) {
		boolean isjavafun = true;
		System.out.println(isjavafun);

		// Boolean Expressions
		int x = 10;
		int y = 5;
		boolean result = x > y;
		System.out.println(result);

		// Boolean condition statement
		boolean isLoggedIn = true;
		if (isLoggedIn) {
			System.out.println("welcome to the account");
		} else {
			System.out.println("please log in first");

		}

		int age = 18;
		if (age >= 18) {
			System.out.println("You are elible to Vote");
		} else {
			System.out.println("You are not eligible to vote");
		}
		int number = -5;
		if (number >= 0) {
			System.out.println("Number is positive");
		} else {
			System.out.println("Number is negative");
		}
		int num = 7;
		if (num % 2 == 0) {
			System.out.println("Number is Even");
		} else {
			System.out.println("Number is odd");
		}

		int marks = 75;
		if (marks >= 50) {
			System.out.println("you passed the exam");
		} else {
			System.out.println("you failed the exam");
		}

		boolean result01 = isEven(6);
		System.out.println(result);
	}

	public static boolean isEven(int num) {
		return num % 2 == 0;

	}

}
