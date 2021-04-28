package activity3_1;

/**
 * Gun Class
 * @author Jamie Lewis
 * 
 * implements WeaponInterface
 */
public class Gun implements WeaponInterface{
	
	/**
	 * Default Constructor
	 */
	public Gun() {
		
	}
	
	/**
	 * Overriding fireWeapon Method
	 */
	@Override
	public void fireWeapon() {
		System.out.println("Using Gun class, default fireWeapon() method.");
		fireWeapon(10);
	}
	
	/**
	 * Overriding and Overloading fireWeapon Method
	 */
	@Override
	public void fireWeapon(int power) {
		System.out.println("Using Gun class, fireWeapon() method, with " +  power + " power. (Called from default Gun.fireWeapon() method.)");
	}
	
	/**
	 * Overriding activate Method
	 */
	@Override
	public void activate(boolean enable) {
		System.out.println("Using Gun class, activate() method, enable is " + enable + ".");
	}

}
