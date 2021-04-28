package assignment4;
import java.util.Random;

/**
 * SuperHero Superclass
 * @author Jamie Lewis
 */
public class SuperHero {

	// Attributes
	String name;
	int health;
	boolean isDead = false;
	
	/**
	 * Non-default SuperHero Constructor
	 * @param name
	 * @param health
	 */
	public SuperHero(String name, int health) {
		super();
		this.name = name;
		this.health = health;
	}
	
	/**
	 * attack method
	 * @param opponent
	 */
	public void attack(SuperHero opponent) {
		int damage = new Random().ints(1,(10+1)).findFirst().getAsInt();
		opponent.determineHealth(damage);
		System.out.println(opponent.name + " takes " + damage + " damage and has " + opponent.health + " remaining.");	
	}
	
	/**
	 * determineHealth method
	 * @param damage
	 */
	//changed from private to protected for use in subclasses
	protected void determineHealth(int damage) {
		if(this.health - damage <= 0) {
			this.health = 0;
			this.isDead = true;
		} else {
			this.health = this.health - damage;
		}
	}
	
	/**
	 * isDead method
	 * @return boolean
	 */
	public boolean isDead() {
		return this.isDead;
	}

}
