package assignment5;

public abstract class Weapon {
	
	public void fireWeapon(int power) {
		System.out.println("Using Weapon class, fireWeapon() method, with " +  power + " power.");
	}
	
	public abstract void activate(boolean enable);

}
