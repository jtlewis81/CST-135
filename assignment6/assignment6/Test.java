package assignment6;

/**
 * @author Jamie Lewis
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create Person objects
		Person person1 = new Person("Jamie", "Lewis");
		Person person2 = new Person("Jamie", "Lewis");
		Person person3 = new Person(person1);
		
		//compare Person objects using == and .equals()
		if(person1 == person2) {
			System.out.println("person1 is equal to person2 using the == test");
		} else {
			System.out.println("person1 and person2 are not equal using the == test");
		}
		if(person1.equals(person2)) {
			System.out.println("person1 is equal to person2 using the equals() method");
		} else {
			System.out.println("person1 and person2 are not equal using the equals() method");
		}
		if(person1.equals(person3)) {
			System.out.println("person1 is equal to person3 using the equals() method");
		} else {
			System.out.println("person1 and person3 are not equal using the equals() method");
		}
		
		// print Person objects using .toString()
		System.out.println("person1 is " + person1.toString());
		System.out.println("person2 is " + person2.toString());
		System.out.println("person3 is " + person3.toString());

	}

}
