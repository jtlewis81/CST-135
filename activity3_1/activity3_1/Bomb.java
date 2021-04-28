package activity3_1;

/**
 * Bomb Class
 * @author Jamie Lewis
 * 
 * implements WeaponInterface
 */
public class Bomb implements WeaponInterface{
	
	/**
	 * Default Constructor
	 */
	public Bomb() {
		
	}
	
	/**
	 * Overriding fireWeapon Method
	 */
	@Override
	public void fireWeapon() {
		System.out.println("Using Bomb class, default fireWeapon() method.");
		fireWeapon(1000000);
	}
	
	/**
	 * Overriding and Overloading fireWeapon Method
	 */
	@Override
	public void fireWeapon(int power) {
		System.out.println("Using Bomb class, fireWeapon() method, with " +  power + " power. (Called from default Bomb.fireWeapon() method.)");
	}	

	/**
	 * Overriding activate Method
	 */
	@Override
	public void activate(boolean enable) {
		System.out.println("Using Bomb class, activate() method, enable is " + enable + ".");
	}

}
