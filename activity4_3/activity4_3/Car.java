package activity4_3;

/**
 * Car Class
 * @author Jamie Lewis
 */
public class Car {
	// Attributes
	private int year;
	private String make;
	private String model;
	private int odometer;
	private double engineLiters;
	
	/**
	 * Default Constructor
	 */
	public Car() {
		
	}
	
	/**
	 * Non-Default Constructor
	 * @param year
	 * @param make
	 * @param model
	 * @param odometer
	 * @param engineLiters
	 */
	public Car(int year, String make, String model, int odometer, double engineLiters) {
		super();
		this.year = year;
		this.make = make;
		this.model = model;
		this.odometer = odometer;
		this.engineLiters = engineLiters;
	}
	
	/**
	 * Year Getter
	 * @return year
	 */
	public int getYear() {
		return year;
	}
	
	/**
	 * Year Setter
	 * @param year
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
	/**
	 * Make Getter
	 * @return make
	 */
	public String getMake() {
		return make;
	}
	
	/**
	 * Make Setter
	 * @param make
	 */
	public void setMake(String make) {
		this.make = make;
	}
	
	/**
	 * Model Getter
	 * @return model
	 */
	public String getModel() {
		return model;
	}
	
	/**
	 * Model Setter
	 * @param model
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * Odometer Getter
	 * @return odometer
	 */
	public int getOdometer() {
		return odometer;
	}
	
	/**
	 * Odometer Setter
	 * @param odometer
	 */
	public void setOdometer(int odometer) {
		this.odometer = odometer;
	}
	
	/**
	 * EngineLiters Getter
	 * @return engineLiters
	 */
	public double getEngineLiters() {
		return engineLiters;
	}
	
	/**
	 * EngineLiters Setter
	 * @param engineLiters
	 */
	public void setEngineLiters(double engineLiters) {
		this.engineLiters = engineLiters;
	}
	
	/**
	 * Overriding toString Method
	 */
	@Override
	public String toString() {
		return "\rCar = [Year: " + year + " - Make: " + make + " - Model: "+ model + " - Odometer: " + odometer + " - EngineLiters: " + engineLiters + "]";
		
	}
}