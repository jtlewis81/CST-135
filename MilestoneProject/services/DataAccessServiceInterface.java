package services;

import addressBook.AddressBook;

/**
 * DataAccessServiceInterface Interface
 * @author Jamie Lewis
 */
public interface DataAccessServiceInterface {

	/**
	 * readAllContacts Method Declaration
	 * @return AddressBook
	 */
	public AddressBook readAllContacts();
	
	/**
	 * saveAllContacts Method Declaration
	 * @param addressbook
	 */
	void saveAllContacts(AddressBook addressbook);
	
}
