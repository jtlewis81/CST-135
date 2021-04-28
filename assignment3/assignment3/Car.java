package assignment3;

/**
 * Assignment 3: Car Class
 * @author Jamie Lewis
 */
public class Car {
	
	//Create individual tires for the tires array	 
	private Tire leftFrontTire = new Tire("left front");
	private Tire rightFrontTire = new Tire("right front");
	private Tire leftRearTire = new Tire("left rear");
	private Tire rightRearTire = new Tire("right rear");
	
	//Attributes
	private Tire[] tires = {leftFrontTire, rightFrontTire, leftRearTire, rightRearTire};
	private Engine engine = new Engine(0);
	private String model;
	private float speed;
	private int weight;
	
	/**
	 * Constructor with weight parameter only
	 * @param weight
	 */
	public Car(String model, int weight, int hp) {
		super();
		this.model = model;
		this.weight = weight;
		this.engine = new Engine(hp);
	}
	
	/**
	 * Tires[] Getter
	 * @return tires
	 */
	public Tire[] getTires() {
		return tires;
	}

	/**
	 * Tires[] Setter
	 * @param tires
	 */
	public void setTires(Tire[] tires) {
		this.tires = tires;
	}

	/**
	 * Model Attribute Getter
	 * @return model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * Model Attribute Setter
	 * @param model
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * Speed Attribute Getter
	 * @return speed
	 */
	public float getSpeed() {
		return speed;
	}

	/**
	 * Speed Attribute Setter
	 * @param speed
	 */
	public void setSpeed(float speed) {
		this.speed = speed;
	}

	/**
	 * Weight Attribute Getter
	 * @return weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * Weight Attribute Setter
	 * @param weight
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	/**
	*  TiresAreInflated Method
	*  checks if tires are inflated - used prior to engine start
	*/
	public boolean tiresAreInflated() {
		int tireCount = 0; 
		for(int i = 0; i < this.tires.length; i++) {
			if(tires[i].getPressure() < 32) {
				tireCount += 1;
			}
		}
		if(tireCount > 0) {
			return false;
		} else {
			return true;
		}
	
	}
	
	/**
	 * StartEngine Method
	 * checks for inflated tires and already running engine
	 */
	public void startEngine() {
		if(tiresAreInflated() == false) {
			System.out.println("OOPS! WAIT! You aren't allowed to start the car without more than 32 psi of air in the tires! Race regulations you know!");
		} else if(this.engine.isRunning() == true) {
			System.out.println("The car's engine is already running!");			
		} else {
			this.engine.setRunning(true);
			System.out.println("The car's engine started!");
		}
	}
	
	/**
	 * StopEngine Method
	 * checks for already stopped engine
	 */
	public void stopEngine() {
		if(this.engine.isRunning() == false) {
			System.out.println("The car's engine was already stopped!");
		} else {
		this.engine.setRunning(false);
		System.out.println("The car's engine stopped!");
		}
	}
	
	/**
	 * Race Method
	 * @return time
	 */
	public double race() {
		double time = 0;
		if(this.engine.isRunning()) {
			
			// Fancy formula I found on the internet and slightly modified to calculate 0-60 times based on weight and power.
			time = Math.round(Math.pow(this.weight / this.engine.getPower() * .9 * .875, .75) * 1e3) / 1e3 + .2;
			
		} else {
			
			System.out.println("Start the car first!");
		}
		return time;
		
	}
	
}
