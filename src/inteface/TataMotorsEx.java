package inteface;

public class TataMotorsEx implements Cars,Engine{

	@Override
	public void brake() {
		System.out.println("Tatamotors has manual brakes");		
	}

	@Override
	public void race() {
	System.out.println("Tatamotors has race limits");	
		
	}

	@Override
	public void powerup() {
		System.out.println("Tatamors has own way to powerup");
		
	}

	@Override
	public void gearup() {
		System.out.println("tatamotors has autmatic gears");
		
	}
	
	public void applynitro() {
	 System.out.println("tatamotord has its own");	
	}

	@Override
	public void getrace() {
		// TODO Auto-generated method stub
		
	}

}
