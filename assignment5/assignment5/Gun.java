package assignment5;

public class Gun extends Weapon{
	
	@Override
	public void fireWeapon(int power) {
		System.out.println("Using Gun class, fireWeapon() method, with " +  power + " power.");
	}
	
	public void fireWeapon() {
		System.out.println("Using overloaded Gun class, fireWeapon() method.");
		super.fireWeapon(10);
	}
	
	@Override
	public void activate(boolean enable) {
		System.out.println("Using Gun class, activate() method, enable is " + enable + ".");
	}

}
