package assignment7;
import java.util.Arrays;

/**
 * Test Class
 * @author Jamie Lewis
 */
public class Test{

	/**
	 * Main Program Loop
	 * @param args
	 */
	public static void main(String[] args) {
		
		// create Person objects
		Person person1 = new Person("Jamie", "Lewis");
		
		// test personInterface methods
		person1.walk();
		person1.run();
		System.out.println("Running status: " + person1.isRunning()); 
		person1.walk();
		System.out.println("Running status: " + person1.isRunning());
		
		// create array of Person objects to be sorted and printed
		Person[] people = new Person[10];
		people[0] = new Person("Jamie", "Lewis", 39);
		people[1] = new Person("Kat", "Lewis", 31);
		people[2] = new Person("Xander", "Lewis", 16);
		people[3] = new Person("Brandon", "Lewis", 5);
		people[4] = new Person("Brooklyn", "Lewis", 3);
		people[5] = new Person("Matthew", "Trezise", 29);
		people[6] = new Person("Courtney", "Trezise", 29);
		people[7] = new Person("Stephanie", "Friend", 36);
		people[8] = new Person("Dan", "Friend", 39);
		people[9] = new Person("Ashton", "Friend", 17);
		Arrays.sort(people);
		for(int i = 0; i < 10; i++) {
			System.out.println(people[i]);
		}
		
	}

}
