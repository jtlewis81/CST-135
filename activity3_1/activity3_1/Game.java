package activity3_1;

/**
 * Game Class
 * @author Jamie Lewis
 */
public class Game {

	/**
	 * Main Program Loop
	 * @param args
	 */
	public static void main(String[] args) {
		
		WeaponInterface[] weapons = new WeaponInterface[2];
		weapons[0] = new Bomb();
		weapons[1] = new Gun();
		
		for(int i = 0; i < weapons.length; i++) {
			fireWeapon(weapons[i]);
		}

	}
	
	/**
	 * fireWeapon helper method
	 * @param weapon
	 */
	public static void fireWeapon(WeaponInterface weapon) {
		
		weapon.activate(true);
		weapon.fireWeapon();		
		
	}

}
