package assignment4;

/**
 * Batman Subclass - Inherits SuperHero Class
 * @author Jamie Lewis
 */
public class Batman extends SuperHero{

	/**
	 * Batman's Constructor
	 * @param health
	 */
	public Batman(int health) {
		super("Batman", health);
	}

	/**
	 * Batman's superpower attack method
	 * @param opponent
	 */
	public void kryptoniteMissles(SuperHero opponent) {
		int damage = 100;
		System.out.println("Batman fires kryptonite missles from the Batmobile!");
		opponent.determineHealth(damage);
		System.out.println(opponent.name + " takes " + damage + " damage and has " + opponent.health + " remaining.");
	}
	
}
