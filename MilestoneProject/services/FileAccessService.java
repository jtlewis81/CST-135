package services;
import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import addressBook.AddressBook;

/**
 * FileAccessService Class
 * @author Jamie Lewis
 */
public class FileAccessService implements DataAccessServiceInterface {

	/**
	 * Overriding readAllContacts Method
	 * @return AddressBook
	 */
	@Override
	public AddressBook readAllContacts() {
		
		AddressBook addressbook = new AddressBook();
		
		try {
			
			addressbook = new ObjectMapper().readerFor(AddressBook.class).readValue(new File("contacts.json"));
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return addressbook;
		
	}

	/**
	 * Overriding saveAllContacts Method
	 * @param addressbook
	 */
	@Override
	public void saveAllContacts(AddressBook addressbook) {
		
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			
			mapper.writerWithDefaultPrettyPrinter().writeValue(new File("contacts.json"), addressbook);
			
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
