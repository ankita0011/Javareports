package inteface;

public class MercedesEx implements Cars{

	@Override
	public void brake() {
	System.out.println("Mercedes has automatic brake sensors ");
		
	}

	@Override
	public void race() {
		System.out.println("Mercedes has limits to race cars");
		
		
	}

	@Override
	public void powerup() {
	System.out.println("Mercedes has powerup batteries");
		
	}

	@Override
	public void gearup() {
		System.out.println("Mercedes has its own gearup");
	
		
	}

}
