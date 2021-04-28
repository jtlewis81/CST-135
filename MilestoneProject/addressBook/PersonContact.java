package addressBook;

import java.util.ArrayList;

/**
 * PersonContact Class
 * @author Jamie Lewis
 */
public class PersonContact extends BaseContact {
	// Attributes
	private String dateOfBirth;
	private String personDescription;
	private ArrayList<PersonContact> relatives;
	
	/**
	 * Default Constructor
	 */
	public PersonContact() {
		
	}
	
	/**
	 * Non-Default Constructor for Relatives
	 * @param id
	 * @param name
	 */
	public PersonContact(int id, String name) {
		super(id, name);
		
	}

	/**
	 * Non-Default Constructor
	 * @param idNumber
	 * @param name
	 * @param phone
	 * @param email
	 * @param location
	 * @param photo
	 * @param dateOfBirth
	 * @param personDescription
	 * @param relatives
	 */
	public PersonContact(int idNumber, String name, String phone, String email, Location location, Photo photo, String dateOfBirth, String personDescription, ArrayList<PersonContact> relatives) {
		super(idNumber, name, phone, email, location, photo);
		this.dateOfBirth = dateOfBirth;
		this.personDescription = personDescription;
		this.relatives = relatives;
	}
	
	/**
	 * dateOfBirth Getter
	 * @return dateOfBirth
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * dateOfBirth Setter
	 * @param dateOfBirth
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * personDescription Getter
	 * @return personDescription
	 */
	public String getPersonDescription() {
		return personDescription;
	}

	/**
	 * personDescription Setter
	 * @param personDescription
	 */
	public void setPersonDescription(String personDescription) {
		this.personDescription = personDescription;
	}

	/**
	 * relatives Getter
	 * @return relatives
	 */
	public ArrayList<PersonContact> getRelatives() {
		return relatives;
	}

	/**
	 * relatives Setter
	 * @param relatives relatives
	 */
	public void setRelatives(ArrayList<PersonContact> relatives) {
		this.relatives = relatives;
	}
	
	/**
	 * addRelative Method
	 * @param contact 
	 */
	public void addRelative(PersonContact contact) {
		this.relatives.add(contact);
	}
		
	/**
	 * removeRelative Method
	 * @param i
	 */
	public void removeRelative(int i) {
		this.relatives.remove(this.relatives.get(i));
	}

	/**
	 * Overriding toString Method
	 */
	@Override
	public String toString() {
		String pString = "\rDate of Birth: " + this.dateOfBirth + "\rPerson Description: " + this.personDescription + "\rRelatives:\r";
		if(this.relatives.size() > 0) {
			for(int r = 0; r < relatives.size(); r++) {
				pString += "[ID#: " + relatives.get(r).getIdNumber() + "] " + relatives.get(r).getName() + "\r";
			}
		}
		return super.toString() + pString + "-------------------------------\r";
	}
}
