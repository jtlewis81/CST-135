package assignment4;

/**
 * Superman Subclass - Inherits SuperHero Class
 * @author Jamie Lewis
 */
public class Superman extends SuperHero{
	
	/**
	 * Superman Constructor
	 * @param health
	 */
	public Superman(int health) {
		super("Superman", health);
	}

	/**
	 * Superman's superpower attack method
	 * @param opponent
	 */
	public void laserVision(SuperHero opponent) {
		int damage = (int) (opponent.health * .42);
		System.out.println("Superman uses laser vision!");
		opponent.determineHealth(damage);
		System.out.println(opponent.name + " takes " + damage + " damage and has " + opponent.health + " remaining.");
	}
		

}
