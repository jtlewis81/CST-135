package addressBook;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * AddressBook Class
 * @author Jamie Lewis
 */
public class AddressBook {
	// Attributes
	private ArrayList<BaseContact> contacts = new ArrayList<BaseContact>();
	
	/**
	 * Default Constructor
	 */
	public AddressBook() {
		
	}

	/**
	 * Non-Default Constructor
	 * @param contacts
	 */
	public AddressBook(ArrayList<BaseContact> contacts) {
		this.contacts = contacts;
	}

	/**
	 * contacts Getter
	 * @return contacts
	 */
	public ArrayList<BaseContact> getContacts() {
		return contacts;
	}

	/**
	 * contacts Setter
	 * @param contacts
	 */
	public void setContacts(ArrayList<BaseContact> contacts) {
		this.contacts = contacts;
	}

	/**
	 * Overriding toString Method
	 */
	@Override
	public String toString() {
		return "AddressBook [contacts=" + contacts + "]";
	}
	
	/**
	 * addContact Method
	 * @param contact 
	 */
	public void addContact(BaseContact contact) {
		this.contacts.add(contact);
	}
		
	/**
	 * removeContact Method
	 */
	public void removeContact(int i) {
		this.contacts.remove(this.contacts.get(i));
	}
	
	/**
	 * displayContact Method
	 * @param id
	 * @return 
	 */
	public String displayContact(int id) {
		return this.contacts.get(id).toString();
	}
	
	/**
	 * sort Method
	 */
	
	//NOTE: THIS METHOD IS STILL UNDEVELOPED AND UNUSED <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	
	public ArrayList<BaseContact> sort(Comparator<? super BaseContact> sortBy) { // This param was edited after JavaDoc generation

		this.contacts.sort(sortBy); // this line is just to remove Eclipse warning
		
		return contacts;
	}
	
	/**
	 * search Method
	 * @param term
	 * @return AddressBook
	 */
	public AddressBook search(String term) {
		// List of contacts to be returned
		AddressBook result = new AddressBook();
		term = term.toLowerCase();
		// loop through contacts
		for(int i = 0; i < this.getContacts().size(); i++) {
			//Search BaseContact properties
			if (this.contacts.get(i).getName().toLowerCase().contains(term) || this.contacts.get(i).getPhone().toLowerCase().contains(term) || this.contacts.get(i).getEmail().toLowerCase().contains(term) || this.contacts.get(i).getLocation().getStreet().toLowerCase().contains(term) || this.contacts.get(i).getLocation().getCity().toLowerCase().contains(term) || this.contacts.get(i).getLocation().getState().toLowerCase().contains(term)) {
				result.addContact(this.contacts.get(i));
			}
			//Search PersonContact properties
			if(this.getContacts().get(i).getClass().getName() == "addressBook.PersonContact") {				
				if(((PersonContact) this.contacts.get(i)).getDateOfBirth().toLowerCase().contains(term) || (((PersonContact) this.contacts.get(i)).getPersonDescription()).contains(term)) {
					result.addContact(this.contacts.get(i));
				}
			}
			//Search BusinessContact properties
			if(this.getContacts().get(i).getClass().getName() == "addressBook.BusinessContact") {				
				if(((BusinessContact) this.contacts.get(i)).getBusinessHours().toLowerCase().contains(term) || ((BusinessContact) this.contacts.get(i)).getWebURL().toLowerCase().contains(term)) {
					result.addContact(this.contacts.get(i));
				}
			}
		}
		return result;
	}

}
