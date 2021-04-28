package addressBook;

/**
 * BusinessContact Class
 * @author Jamie Lewis
 */
public class BusinessContact extends BaseContact{
	// Attributes
	private String businessHours;
	private String webURL;
	
	/**
	 * Default Constructor
	 */
	public BusinessContact() {
		
	}

	/**
	 * Non-Default Constructor
	 * @param idNumber
	 * @param name
	 * @param phone
	 * @param email
	 * @param location
	 * @param photo
	 * @param businessHours
	 * @param webURL
	 */
	public BusinessContact(int idNumber, String name, String phone, String email, Location location, Photo photo, String businessHours, String webURL) {
		super(idNumber, name, phone, email, location, photo);
		this.businessHours = businessHours;
		this.webURL = webURL;
	}

	/**
	 * businessHours Getter
	 * @return businessHours
	 */
	public String getBusinessHours() {
		return businessHours;
	}

	/**
	 * businessHours Setter
	 * @param businessHours
	 */
	public void setBusinessHours(String businessHours) {
		this.businessHours = businessHours;
	}

	/**
	 * webURL Getter
	 * @return webURL
	 */
	public String getWebURL() {
		return webURL;
	}

	/**
	 * webURL Setter
	 * @param webURL
	 */
	public void setWebURL(String webURL) {
		this.webURL = webURL;
	}

	/**
	 * Overriding toString Method
	 */
	// UPDATED to make it pretty in the console!
	@Override
	public String toString() {
		return super.toString() + "\rBusiness Hours: " + businessHours + "\rWebsite:" + webURL + "\r-------------------------------\r";
	}	
}
