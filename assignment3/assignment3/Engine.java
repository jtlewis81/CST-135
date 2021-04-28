package assignment3;

/**
 * Assignment 3: Engine Class
 * @author Jamie Lewis
 *
 */
public class Engine {
	
	/**
	 * Attributes
	 */
	private int power;
	private Boolean running = false;

	/**
	 * Default Constructor
	 */
	public Engine(int hp) {
		super();
		this.power = hp;
	}

	/**
	 * Power Attribute Getter
	 * @return power
	 */
	public int getPower() {
		return power;
	}

	/**
	 * Power Attribute Setter
	 * @param power
	 */
	public void setPower(int power) {
		this.power = power;
	}

	/**
	 * Running Attribute Getter
	 * @return running
	 */
	public Boolean isRunning() {
		return running;
	}

	/**
	 * Running Attribute Setter
	 * @param running 
	 */
	public void setRunning(Boolean running) {
		this.running = running;
	}
	
}
