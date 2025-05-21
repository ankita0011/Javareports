package switchcase;

public class IfBlock {

	public static void main(String[] args) {
		IfBlock dayobj = new IfBlock();
		dayobj.dayoftheweek("Saturday");

	}

	public void dayoftheweek(String dayoftheweek) {

		// String day = "Wednesday";

		if (dayoftheweek.equals("Sunday")) {
			System.out.println("its Sunday today");
		}
		if (dayoftheweek.equals("Monday")) {
			System.out.println("its Monday today");
		}
		if (dayoftheweek.equals("Tuesday")) {
			System.out.println("its Tuesday today");
		}
		if (dayoftheweek.equals("Wednesday")) {
			System.out.println("its Wednesday today");
		}
		if (dayoftheweek.equals("Thursday")) {
			System.out.println("its Thursday today");
		}
		if (dayoftheweek.equals("Friday")) {
			System.out.println("its Friday today");
		}
		if (dayoftheweek.equals("Saturday")) {
			System.out.println("its Saturday today");
		}

	}

}
