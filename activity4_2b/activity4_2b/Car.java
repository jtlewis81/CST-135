package activity4_2b;

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
	 * @return year
	 */
	public int getYear() {
		return year;
	}
	
	/**
	 * @param year year
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
	/**
	 * @return make
	 */
	public String getMake() {
		return make;
	}
	
	/**
	 * @param make make
	 */
	public void setMake(String make) {
		this.make = make;
	}
	
	/**
	 * @return model
	 */
	public String getModel() {
		return model;
	}
	
	/**
	 * @param model model
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return odometer
	 */
	public int getOdometer() {
		return odometer;
	}
	
	/**
	 * @param odometer odometer
	 */
	public void setOdometer(int odometer) {
		this.odometer = odometer;
	}
	
	/**
	 * @return engineLiters
	 */
	public double getEngineLiters() {
		return engineLiters;
	}
	
	/**
	 * @param engineLiters engineLiters
	 */
	public void setEngineLiters(double engineLiters) {
		this.engineLiters = engineLiters;
	}
	
}
