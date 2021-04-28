package addressBook;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
		  use = JsonTypeInfo.Id.NAME, 
		  include = JsonTypeInfo.As.PROPERTY, 
		  property = "type")
		@JsonSubTypes({
		  @Type(value = PersonContact.class, name = "personContact"), 
		  @Type(value = BusinessContact.class, name = "businessContact") 
		})

/**
 * BaseContact Class
 * @author Jamie Lewis
 */
public abstract class BaseContact {
	// Attributes
	private int idNumber;
	private String name;
	private String phone;
	private String email;
	private Location location;
	private ArrayList<Photo> photos = new ArrayList<Photo>();
	
	/**
	 * Default Constructor
	 */
	public BaseContact() {
		
	}
	
	/**
	 * Non-Default Constructor
	 * @param idNumber
	 * @param name
	 * @param phone
	 * @param email
	 * @param location
	 * @param photo
	 */
	public BaseContact(int idNumber, String name, String phone, String email, Location location, Photo photo) {
		this.idNumber = idNumber;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.location = location;
		this.photos.add(photo);
	}

	/**
	 * Non-Default Constructor for PersonContact Relatives
	 * @param id
	 * @param relativeName
	 */
	public BaseContact(int id, String relativeName) {
		this.idNumber = id;
		this.name = relativeName;
	}

	/**
	 * idNumber Getter
	 * @return idNumber
	 */
	public int getIdNumber() {
		return idNumber;
	}

	/**
	 * idNumber Setter
	 * @param idNumber
	 */
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	/**
	 * name Getter
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * name Setter
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * phone Getter
	 * @return phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * phone Setter
	 * @param phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * email Getter
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * email Setter
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * location Getter
	 * @return location
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * location Setter
	 * @param location
	 */
	public void setLocation(Location location) {
		this.location = location;
	}

	/**
	 * photos Getter
	 * @return photos
	 */
	public ArrayList<Photo> getPhotos() {
		return photos;
	}

	/**
	 * photos Setter
	 * @param photos
	 */
	public void setPhotos(ArrayList<Photo> photos) {
		this.photos = photos;
	}

	/**
	 * Overriding toString Method
	 */
	// UPDATED to make it pretty in the console!
	@Override
	public String toString() {
		return "-------------------------------\r[CONTACT ID#: " + idNumber + "] Name: " + name + "\rPhone#: " + phone + "\rEmail: " + email
				+ "\r" + location + photos;
	}
}
