package assignment3;

/**
 * Assignment 3: "Driver" Script
 * @author Jamie Lewis
 *
 * I added a few little things to give this project some flare,
 * including a little storyline that plays out in the console
 * to demonstrate some of the checks and features. There are a
 * few unused class attributes and method features that I think
 * go beyond the scope of this assignment as well, but I was
 * unsure if this project would get revisited.
 */
public class RaceCar {
	
	public static Car raceCar = new Car("Viper SRT-10", 3600, 600);
	public static int psi = 35;
	public static double time = 0;
	
	public static void main(String[] args) {
		
		System.out.println("Your new " + raceCar.getModel() + " has been delivered! Get ready to race!");
		raceCar.startEngine();
		for(int i = 0; i < raceCar.getTires().length; i++) {
			raceCar.getTires()[i].setPressure(psi);
			System.out.println("Air pressure was set to " + psi + " psi in the " + raceCar.getTires()[i].getLocation() + " tire.");
		}		
		System.out.println("There, that's much better!");
		raceCar.startEngine();
		raceCar.startEngine();
		System.out.println("Go easy on that starter there, Rookie! Alright, let's race!");
		System.out.println("3...2...1...GO!!!");
		time = raceCar.race();
		if(time > 0) {
			System.out.println("Your " + raceCar.getModel() + " ran from 0 to 60 MPH in about " + (float)Math.round(time*1000)/1000 + " seconds!");
		} else {
			System.out.println("Something went wrong!");
		}
		raceCar.stopEngine();
		raceCar.stopEngine();
		raceCar.startEngine(); // Restart functionality demonstrated - I saw no point in creating a "restart" method.
	}

}
