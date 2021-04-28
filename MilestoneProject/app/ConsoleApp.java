package app;
import java.util.ArrayList;
import java.util.Scanner;
import addressBook.*;
import services.FileAccessService;

/**
 * ConsoleApp Class
 * @author Jamie Lewis
 */
public class ConsoleApp {
	// static variables for instance of running app
	private static FileAccessService fas = new FileAccessService();
	private static AddressBook myAddressBook = new AddressBook();
	private static Scanner input = new Scanner(System.in);
	
	
	/**
	 * Main Program Loop
	 * @param args
	 */
	public static void main(String[] args) {
		// some statements to add a little something for user experience
		System.out.println("Program starting...loading Address Book...");
		
		// load contacts from file
		myAddressBook = fas.readAllContacts();
		refreshRelatives();
		
		// another statement
		System.out.println("Address Book loaded.\rLoading Menu...");
		
		// start the Menu - everything else runs from this
		appMenu();
		
	}

	/**
	 * showMenu Method
	 */
	private static void appMenu() {
		// Build the menu display through a System.out.println
		// Includes an info line at the bottom with total number of existing contacts
		System.out.println("#################################################\r"
				+ "PLEASE ENTER A NUMBER TO CHOOSE AN OPTION:\r"
				+ "1 - Add a New Contact\r"
				+ "2 - Display All Contacts\r"
				+ "3 - Display One Contact by ID Number\r"
				+ "4 - Edit a Contact by ID Number\r"
				+ "5 - Delete a Contact by ID Number\r"
				+ "6 - Search Contacts\r"
				+ "7 - Exit the Program\r"
				+ "#################################################\r"
				+ "Your AddressBook contains " + myAddressBook.getContacts().size() + " contacts.\r"
				+ "#################################################\r");
		// Get user input
		int i = input.nextInt();
		switch (i) { // do something with user input
			case 1: // add a new contact
				newContact();
				break;
			case 2: // display all contacts - useful for finding id numbers
				displayAllContacts();
				break;
			case 3: // display one contact by passed id number
				System.out.println("Which Contact would you like to display? Provide an ID number.");
				int s = input.nextInt();
				displayOneContact(s);
				break;
			case 4: // edit a contact by passed id number
				System.out.println("Which Contact would you like to edit? Provide an ID number.");
				int e = input.nextInt();
				editContact(e);
				break;
			case 5: // delete a contact by passed id number
				if(myAddressBook.getContacts().size() > 0) {
					System.out.println("Which Contact would you like to delete? Provide an ID number.");
					int d = input.nextInt();
					deleteContact(d);
				} else {
					System.out.println("Your AddressBook is already empty! Returning to Menu...\r");
				}	
				appMenu();
				break;
			case 6: // search contacts
				searchContacts();
				break;
			case 7: // terminate app
				ConsoleApp.exit();
				break;
			default: // catch if a wrong number key is entered
				System.out.println("Please make a valid selection.");
				appMenu(); // restart appMenu
		}
		
	}
	
	/**
	 * newContact Method
	 */
	private static void newContact() {
		// determine which subclass new contact will be
		System.out.println("Creating a New Contact...\r"
				+ "Will this be a Person or Business Contact?\r"
				+ "1 - Person\r"
				+ "2 - Business");
		int i = input.nextInt(); // user input
		input.nextLine(); // makes scanner work as expected
		
		// Contact's ID Number is automatically generated
		int idNumber = myAddressBook.getContacts().size();		
				
		// Variables to hold values for constructor fields
		String name;
		String phone;
		String email;
		Location location = new Location();
		Photo photo = new Photo();
		
		// Collect information for BaseContact
		System.out.println("Name:");
		name = input.nextLine();
		System.out.println("Phone #:");
		phone = input.nextLine();
		System.out.println("Email:");
		email = input.nextLine();
		
		// Create Location
		location.setLocationID(0);
		System.out.println("Location - Street:");
		location.setStreet(input.nextLine());
		System.out.println("Location - City:");
		location.setCity(input.nextLine());
		System.out.println("Location - State:");
		location.setState(input.nextLine());
		
		// Create Photo
		photo.setPhotoID(0);
		System.out.println("File for photo:");
		photo.setFile(input.nextLine());
		System.out.println("Photo Date:");
		photo.setPhotoDate(input.nextLine());
		System.out.println("Photo Description");
		photo.setPhotoDescription(input.nextLine());
		
		// do different things based on previous user input
		if(i == 1) { // if is PersonContact
			// PersonContact attributes
			String dateOfBirth;
			String description;
			ArrayList<PersonContact> relatives = new ArrayList<PersonContact>();
			
			// Collect information specific to PersonContact
			System.out.println("Date of Birth:");
			dateOfBirth = input.nextLine();
			System.out.println("Person Description:");
			description = input.nextLine();
			
			// Create the contact from the gathered info and add it to the addressBook
			BaseContact person = new PersonContact(idNumber, name, phone, email, location, photo, dateOfBirth, description, relatives);
			myAddressBook.addContact(person);
			System.out.println("Contact added!");
			refreshRelatives();
			System.out.println("All contacts' relatives updated.\rReturning to the menu...");
			
			appMenu(); // restart appMenu
			
		} else if (i == 2) { // if is BusinessContact
			// BusinessContact attributes
			String businessHours;
			String webURL;
			
			// Collect information specific to BusinessContact
			System.out.println("Business Hours:");
			businessHours = input.nextLine();
			System.out.println("Website URL:");
			webURL = input.next();
			BaseContact business = new BusinessContact(idNumber, name, phone, email, location, photo, businessHours, webURL);
			myAddressBook.addContact(business);
			System.out.println("Contact added! Returning to the menu...\r");
			appMenu();
			
		} else {
			// error catching
			System.out.println("Please make a valid selection.");
			newContact();			
		}
	}
	
	/**
	 * displayAllContacts Method
	 */
	private static void displayAllContacts() {
		System.out.println("Displaying all contacts...\r");
		for(int c = 0; c < myAddressBook.getContacts().size(); c++) {
			System.out.println(myAddressBook.displayContact(c));
		}
		System.out.println("All contacts displayed. Showing Menu...\r");
		appMenu(); // restart appMenu
		
	}
	
	/**
	 * displayOneContact Method
	 * @param i
	 */
	private static void displayOneContact(int i) {
		System.out.println(myAddressBook.displayContact(i));
		// option to edit displayed contact
		System.out.println("Would you like to edit this contact?\r" 
				+ "1 = Yes\r"
				+ "2 - No - Return to Menu");
		int e = input.nextInt();
		if(e == 1) {
			editContact(i); // calls editContact method and passes currently displayed contact's id number
		} else if(e == 2) {
			System.out.println("Returning to the Menu...");
			appMenu();
		} else {
			System.out.println("Please make a valid selection.");
			displayOneContact(i);
		}
		
	}
	
	/**
	 * editContact Method
	 * @param i
	 */
	private static void editContact(int i) {
		// print current state of contact to edit	
		System.out.println("Editing " + myAddressBook.getContacts().get(i).getName() + ":\r"
				+ myAddressBook.getContacts().get(i).toString());
		// offer options - inaccessible elements include id numbers and relatives, as these are handled automatically.
		// except relatives is not updated after editing a contact's address, which the criteria for being a realtive is based on.
		System.out.println("Which element would you like to edit?\r"
				+ "1 - Name\r"
				+ "2 - Phone\r"
				+ "3 - Email\r"
				+ "4 - Street\r"
				+ "5 - City\r"
				+ "6 - State\r"
				+ "7 - Add a Photo\r"
				+ "8 - Delete a Photo");
		// load different options for PersonContact or BusinessContact
		if(myAddressBook.getContacts().get(i).getClass().getName() == "addressBook.PersonContact") {
			System.out.println("9 - Date of Birth\r"
					+ "10 - Person Description\r");
		} else {
			System.out.println("9 - Business Hours\r"
					+ "10 - Website\r");
		}
		Integer e = input.nextInt(); // user input
		System.out.println("What would you like to update the field to? (For photo operations, just press ENTER.)");
		String f = input.nextLine(); // user input
		f = input.nextLine(); // another stupid scanner fix
		// use the info provided by the user to update the contact
		switch(e) {
			case 1:
				myAddressBook.getContacts().get(i).setName(f);
				break;
			case 2:
				myAddressBook.getContacts().get(i).setPhone(f);
				break;
			case 3:
				myAddressBook.getContacts().get(i).setEmail(f);
				break;
			case 4:
				myAddressBook.getContacts().get(i).getLocation().setStreet(f);
				refreshRelatives();
				break;
			case 5:
				myAddressBook.getContacts().get(i).getLocation().setCity(f);
				refreshRelatives();
				break;
			case 6:
				myAddressBook.getContacts().get(i).getLocation().setState(f);
				refreshRelatives();
				break;
			case 7: // create a new photo object
				System.out.println("Enter the new photo information:");
				ArrayList<Photo> tempPhotos = myAddressBook.getContacts().get(i).getPhotos(); // get original photos ArrayList
				Photo photo = new Photo();
				// borrowed code from newContact method
				photo.setPhotoID(myAddressBook.getContacts().get(i).getPhotos().size());
				System.out.println("File for photo:");
				photo.setFile(input.nextLine());
				System.out.println("Photo Date:");
				photo.setPhotoDate(input.nextLine());
				System.out.println("Photo Description:");
				photo.setPhotoDescription(input.nextLine());
				tempPhotos.add(photo); // add new photo to old ones
				myAddressBook.getContacts().get(i).setPhotos(tempPhotos); // overwrite contact's photos ArrayList with updated ArrayList 
				System.out.println("Photo added.");
				break;
			case 8: // Delete a photo
				System.out.println("Which photo would you like to delete? Please enter the Photo ID.\r"
						+ myAddressBook.getContacts().get(i).getPhotos().toString()); // show current photos list info
				int pID = input.nextInt(); // get user input
				myAddressBook.getContacts().get(i).getPhotos().remove(pID);
				// update photo id numbers to element index in the ArrayList
				for(int p = 0; p < myAddressBook.getContacts().get(i).getPhotos().size(); p++) {
					myAddressBook.getContacts().get(i).getPhotos().get(p).setPhotoID(p);
				}
				System.out.println("Photo deleted.");
				break;
			case 9: // update date of birth or business hours, depending on type of contact
				if(myAddressBook.getContacts().get(i).getClass().getName() == "addressBook.PersonContact") {
					((PersonContact) myAddressBook.getContacts().get(i)).setDateOfBirth(f);
				} else {
					((BusinessContact) myAddressBook.getContacts().get(i)).setBusinessHours(f);
				}
				break;
			case 10: // update person description or webURL, depending on type of contact 
				if(myAddressBook.getContacts().get(i).getClass().getName() == "addressBook.PersonContact") {
					((PersonContact) myAddressBook.getContacts().get(i)).setPersonDescription(f);
				} else {
					((BusinessContact) myAddressBook.getContacts().get(i)).setWebURL(f);
				}
				break;
			default: // catch if wrong number entered
				System.out.println("Please make a valid selection.");
				editContact(i);
		}
		// offer further updates to currently selected contact
		System.out.println("Contact updated. Would you like to update this contact further?\r"
				+ "1 - Yes\r"
				+ "2 - No");
		int x = input.nextInt();
		if(x == 1) {
			editContact(i);
		} else if(x == 2) {
			System.out.println("Returning to Menu...");
			appMenu(); // restart appMenu
		}		
	}
	
	/**
	 * deleteContact Method
	 * @param d
	 */
	private static void deleteContact(int d) {
		// delete the contact
		myAddressBook.removeContact(d);
		// update contacts' id numbers to ArrayList index position
		for(int c = 0; c < myAddressBook.getContacts().size(); c++) {
			myAddressBook.getContacts().get(c).setIdNumber(c);
		}
		//remove from relatives
		refreshRelatives();
	}
	
	/**
	 * searchContacts Method
	 */
	private static void searchContacts() {
		System.out.println("Enter search term:");
		String term = input.nextLine(); // user input
		term = input.nextLine(); // makes the scanner work as expected.
		AddressBook results = new AddressBook(); // use new addressBook object (essentially an ArrayList of contacts) to display results.
		results = myAddressBook.search(term);
		// print results
		for(int r = 0; r < results.getContacts().size(); r++) {
			System.out.println(results.getContacts().get(r).toString());
		}
		System.out.println("Results printed.\rShowing Menu...");
		appMenu(); // restart appMenu
	}
	
	
	/**
	 * exit Method
	 */
	private static void exit() {
		input.close(); // closes input
		fas.saveAllContacts(myAddressBook); // save all contact data from memory to a json file
		System.out.println("Exiting App...");
		// app is terminated by not calling appMenu again
	}
	
	/**
	 * refreshRelatives Method
	 */
	private static void refreshRelatives() {
		for(int i = 0; i < myAddressBook.getContacts().size(); i++) {
			((PersonContact) myAddressBook.getContacts().get(i)).getRelatives().clear();
		}
		for(int i = 0; i < myAddressBook.getContacts().size(); i++) { // loop through the contact list
			for(int x = 0; x < myAddressBook.getContacts().size(); x++) { // for each contact, loop through the contact list
				if(myAddressBook.getContacts().get(i).getName().toString() != myAddressBook.getContacts().get(x).getName().toString() && // don't add a contact to their own relatives list
					myAddressBook.getContacts().get(i).getClass().getName() == "addressBook.PersonContact" && // only look at personContact type contacts
					myAddressBook.getContacts().get(i).getLocation().getStreet().toString().equals(myAddressBook.getContacts().get(x).getLocation().getStreet().toString()) && // compare street
					myAddressBook.getContacts().get(i).getLocation().getCity().toString().equals(myAddressBook.getContacts().get(x).getLocation().getCity().toString()) && // compare city
					myAddressBook.getContacts().get(i).getLocation().getState().toString().equals(myAddressBook.getContacts().get(x).getLocation().getState().toString())) { // compare state
					// if all conditions are met, add the currently indexed contact to the relatives list of the contact being compared against
					PersonContact tempR = new PersonContact();
					tempR.setIdNumber(myAddressBook.getContacts().get(x).getIdNumber());
					tempR.setName(myAddressBook.getContacts().get(x).getName());
					if (((PersonContact) myAddressBook.getContacts().get(i)).getRelatives().size() == 0) {
						((PersonContact) myAddressBook.getContacts().get(i)).addRelative(tempR);
					} else {
						for(int y = 0; y < ((PersonContact) myAddressBook.getContacts().get(i)).getRelatives().size(); y++) {							
							if(tempR.getName().toString() != ((PersonContact) myAddressBook.getContacts().get(i)).getRelatives().get(y).getName().toString()) {
								((PersonContact) myAddressBook.getContacts().get(i)).addRelative(tempR);
							}
						}
					}
				}
			}
		}	
	}
}



// PREVIOUS MILESTONE CODE **********************************************************
// create some locations
//Location location1 = new Location(0, "E Street", "Oakland", "MD");
//Location location2 = new Location(1, "Broadford Road", "Oakland", "MD");
//Location location3 = new Location(2, "Some Street", "Some Town", "Some State");


// create a photo object to use for testing - no actual file handling yet
//Photo photo1 = new Photo(1, "someFileName", "date photo taken", "picture of the contact");


// create some contacts
//BaseContact person1 = new PersonContact(0, "Jamie Lewis", "2403212502", "jlewis159@my.gcu.edu", location1, photo1, "9/14/1981", "myself", new PersonContact[]{});
//BaseContact person2 = new PersonContact(1, "Some Person", "888-555-1111", "some email", location2, photo1, "some born day", "hobby", new PersonContact[]{});
//BaseContact business1 = new BusinessContact(2, "Some Business", "123456890", "a business email", location3, photo1, "M-F: 9-5, Closed Sat and Sun", "some URL");
//BaseContact business2 = new BusinessContact(3, "Some Business", "0987654321", "some other email", location3, photo1, "M-F: 8-4, Sat: 8-12, Closed Sun", "some other URL");


// add contacts to addressbook
//myAddressBook.addContact(person1);
//myAddressBook.addContact(person2);
//myAddressBook.addContact(business1);
//myAddressBook.addContact(business2);


//System.out.println("DISPLAY CONTACTS INDIVIDUALLY USING ID TO PULL FROM ADDRESSBOOK OBJECT\r");
//
//System.out.println(myAddressBook.displayContact(0));
//
//System.out.println("\rEDIT OR UPDATE ANY CONTACT, PHOTO, OR ADDRESS\r");
//
//BaseContact contactToEdit = myAddressBook.getContacts().get(0);
//contactToEdit.setName("Me, Myself, & I");
//System.out.println(myAddressBook.displayContact(0));
//
//System.out.println("\rDELETE A CONTACT\r");
//
//System.out.println("There are " + myAddressBook.getContacts().size() + " contacts in this addressbook.");
//myAddressBook.removeContact(business1);
//System.out.println("There are " + myAddressBook.getContacts().size() + " contacts in this addressbook.");
//
//System.out.println("\rTRY A SEARCH BY NAME, CITY, AND HOBBY\r");
//
//// The search terms must be exact for each field for now, but will refine as we go. 
//System.out.println(myAddressBook.search("Some Business") + "\r");
//System.out.println(myAddressBook.search("Oakland") + "\r");
//System.out.println(myAddressBook.search("hobby") + "\r");
//
//System.out.println("END");