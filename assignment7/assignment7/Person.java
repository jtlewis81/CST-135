package assignment7;

/**
 * Person Class
 * @author Jamie Lewis
 */
public class Person implements PersonInterface, Comparable<Person> {

	// Attributes
	private String fName;
	private String lName;
	private int age;
	private boolean walking = false;
	private boolean running = false;
	
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
	 * Non-Default Constructor
	 * @param fName
	 * @param lName
	 * @param age
	 */
	public Person(String fName, String lName, int age) {
		this.fName = fName;
		this.lName = lName;
		this.age = age;
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
	 * fName Getter
	 * @return fName
	 */
	public String getFname() {
		return fName;
	}

	/**
	 * fName Setter
	 * @param fName
	 */
	public void setFname(String fName) {
		this.fName = fName;
	}

	/**
	 * lName Getter
	 * @return lName
	 */
	public String getLname() {
		return lName;
	}

	/**
	 * lName Setter
	 * @param lName
	 */
	public void setLname(String lName) {
		this.lName = lName;
	}
	
	/**
	 * age Getter
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * age Setter
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * isWalking Method
	 * @return walking
	 */
	public boolean isWalking() {
		return walking;
	}

	/**
	 * stop Method
	 * sets walking and running to false
	 */
	public void stop() {
		this.walking = false;
		this.running = false;
	}

	/**
	 * Overriding equals Method
	 */
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
	
	/**
	 * Overriding toString Method
	 */
	@Override
	public String toString() {
		return this.fName + " " + this.lName + ", age " + this.age;
	}

	/**
	 * Overriding walk Method
	 */
	@Override
	public void walk() {
		System.out.println(this.fName + " is walking.");
		this.running = false;
		this.walking = true;
	}

	/**
	 * Overriding run Method
	 */
	@Override
	public void run() {
		System.out.println(this.fName + " is running.");
		this.walking = false;
		this.running = true;
	}
	
	/**
	 * Overriding isRunning Method
	 */
	@Override
	public boolean isRunning() {
		return this.running;
	}

	/**
	 * Overriding compareTo Method
	 * @param person 
	 */
	@Override
	public int compareTo(Person person) {
		
		int i = this.age - person.age;
		if(i == 0) {
			int x = this.lName.compareTo(((Person)person).lName);
			if(x == 0) {
				return this.fName.compareTo(((Person)person).fName);
			} else {
				return x;
			}
		} else {
			return i;
		}		
	}
}
