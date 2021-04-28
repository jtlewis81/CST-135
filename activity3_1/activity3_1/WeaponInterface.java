package activity3_1;

/**
 * WeaponInterface Interface
 * @author Jamie Lewis
 */
public interface WeaponInterface {
	
	/**
	 * fireWeapon Method Declaration
	 * no args
	 */
	public void fireWeapon();
	
	/**
	 * Overloading fireWeapon Method Declaration
	 * @param power
	 */
	public void fireWeapon(int power);
	
	/**
	 * activate Method Declaration
	 * @param enable
	 */
	public void activate(boolean enable);

}
