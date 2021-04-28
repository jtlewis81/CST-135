package assignment5;

public class Bomb extends Weapon{
	
	@Override
	public void fireWeapon(int power) {
		System.out.println("Using Bomb class, fireWeapon() method, with " +  power + " power.");
	}

	public void fireWeapon() {
		System.out.println("Using overloaded Bomb class, fireWeapon() method.");
		super.fireWeapon(1000000);
	}

	@Override
	public void activate(boolean enable) {
		System.out.println("Using Bomb class, activate() method, enable is " + enable + ".");
	}

}
