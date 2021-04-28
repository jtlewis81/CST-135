package assignment4;

import java.util.Random;

/**
 * Main "Driver" Class for SuperHero Battle Game - Activity 2 Part 1 Assignment
 * @author Jamie Lewis 
 */
public class Game {
	
	// turn counter variable
	public static int i = 0;

	
	/**
	 * Main Program Loop
	 * @param args
	 */
	public static void main(String[] args) {

		// Instantiate Super Heroes, announce game start, declare randomly generated starting health
		System.out.println("Super Heroes are entering the arena...");
		Superman superman = new Superman(new Random().ints(1,(1000+1)).findFirst().getAsInt());
		System.out.println("Superman will start with " + superman.health + " health.");
		Batman batman = new Batman(new Random().ints(1,(1000+1)).findFirst().getAsInt());
		System.out.println("Batman will start with " + batman.health + " health.");
		System.out.println("Fight!!!");
		
		// Battle Loop
		while(!superman.isDead() && !batman.isDead()) {
			
			// Heros take turns attacking
			superman.attack(batman);
			// If a hero dies, declare a winner and break out of the loop.
			if(batman.isDead()) {
				System.out.println("Superman wins!");
				break;
			}
			batman.attack(superman);
			if(superman.isDead()) {
				System.out.println("Batman wins!");
				break;
			}
			
			// Use super powers every 10th turn
			if(i == 8) {
				superman.laserVision(batman);
				// Also checks for winner and breaks out of loop on hero death.
				if(batman.isDead()) {
					System.out.println("Superman wins!");
					break;
				}
				batman.kryptoniteMissles(superman);
				if(superman.isDead()) {
					System.out.println("Batman wins!");
					break;
				}
				// reset counter once powers are used
				i = 0;
			}
			// increment tun counter
			i++;
			
		}
	}
}