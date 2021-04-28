package addressBook;

/**
 * Location Class
 * @author Jamie Lewis
 */
public class Location {
	//Attributes
	private int locationID;
	private String street;
	private String city;
	private String state;

	/**
	 * Default Constructor
	 */
	public Location() {
		
	}

	/**
	 * Non-Default Constructor
	 * @param locationID
	 * @param street
	 * @param city
	 * @param state
	 */
	public Location(int locationID, String street, String city, String state) {
		super();
		this.locationID = locationID;
		this.street = street;
		this.city = city;
		this.state = state;
	}

	/**
	 * locationID Getter
	 * @return locationID
	 */
	public int getLocationID() {
		return locationID;
	}

	/**
	 * locationID Setter
	 * @param locationID
	 */
	public void setLocationID(int locationID) {
		this.locationID = locationID;
	}

	/**
	 * street Getter
	 * @return street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * street Setter
	 * @param street
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * city Getter
	 * @return city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * city Setter
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * state Getter
	 * @return state
	 */
	public String getState() {
		return state;
	}

	/**
	 * state Setter
	 * @param state
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Overriding toString Method
	 */
	// UPDATED to make it pretty in the console!
	@Override
	public String toString() {
		return "[Location ID: " + locationID + "]\r" + street + "\r" + city + ", " + state + "\r";
	}
}
