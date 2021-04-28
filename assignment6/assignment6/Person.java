package assignment6;

/**
 * Person Class
 * @author Jamie Lewis
 */
public class Person {

	// Attributes
	private String fName;
	private String lName;
	
	/**
	 * Non-Default Constructor
	 * @param fName
	 * @param lName
	 */
	public Person(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
	}
	
	/**
	 * Copy Constructor
	 * @param person
	 */
	public Person(Person person) {
		this.fName = person.getFname();
		this.lName = person.getLname();
	}

	/**
	 * @return fName
	 */
	public String getFname() {
		return fName;
	}

	/**
	 * @param fName
	 */
	public void setFname(String fName) {
		this.fName = fName;
	}

	/**
	 * @return lName
	 */
	public String getLname() {
		return lName;
	}

	/**
	 * @param lName
	 */
	public void setLname(String lName) {
		this.lName = lName;
	}
	
	@Override
	public boolean equals(Object comp) {
		if(this.fName == ((Person) comp).getFname() && this.lName == ((Person)comp).lName) {
			System.out.println("The first and last names are the same! equals() method successfully overridden!");
			return true;
		} else {
			System.out.println("The names are not the same!");
			return false;
		}
	}
	
	@Override
	public String toString() {
		return this.fName + " " + this.lName;
	}
}
