package assignment3;

/**
 * Assignment 3: Tire Class
 * @author Jamie Lewis
 */
public class Tire {
	
	/**
	 * Attributes
	 */
	private String location;
	private int airPressure = 0;
	
	/**
	 * Default Constructor
	 */
	public Tire(String location) {
		super();
		this.setLocation(location);
	};

	/**
	 * Location Attribute Getter
	 * @return location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * Location Attribute Setter
	 * @param location
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * AirPressure Attribute Getter
	 * @return airPressure
	 */
	public int getPressure() {
		return airPressure;
	}

	/**
	 * AirPressure Attribute Setter
	 * @param airPressure
	 */
	public void setPressure(int psi) {
		this.airPressure = psi;
	}

}
