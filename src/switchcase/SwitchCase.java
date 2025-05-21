package switchcase;

public class SwitchCase {
	public static void main(String[] args) {

		SwitchCase swex = new SwitchCase();
		swex.dayoftheweek("Wednesday");
		char grade = 'B';
		int a = 10, b = 5;
		char operator = '+';

		switch (operator) {
		case '+':
			System.out.println("Result:" + (a + b));
			break;

		case '-':
			System.out.println("Result:" + (a + b));
			break;

		case '*':
			System.out.println("Result:" + (a + b));
			break;

		case '/':
			System.out.println("Result:" + (a / b));
			break;
		}

	}

	public void dayoftheweek(String dayoftheweek) {

		switch (dayoftheweek) {

		case "Sunday": {
			System.out.println("its Sunday");
			break;
		}
		case "Monday": {
			System.out.println("its Monday");
			break;
		}
		case "Tuesday": {
			System.out.println("its Tuesday");
			break;
		}
		case "Wednesday": {
			System.out.println("its Wednesday");
			break;
		}
		case "Thursday": {
			System.out.println("its Thursday");
			break;
		}
		case "Friday": {
			System.out.println("its Friday");
			break;
		}
		case "Saturday": {
			System.out.println("its Saturday");
			break;
		}
		default:
			System.out.println("Supply me a day");
		}

		switch (grade) {

		case 'A': {
			System.out.println("excellent");
			break;

		}
		case 'B': {
			System.out.println("Good Job");
			break;
		}
		case 'C': {
			System.out.println("Well done");
			break;
		}
		case 'D': {
			System.out.println("You Passed");
			break;
		}
		case 'F': {
			System.out.println("Better try again");
			break;

		}
		default:
			System.out.println("Invalid grade");
		}
	}

}
