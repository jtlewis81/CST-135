package activity3_3;
import java.util.LinkedList;
import java.util.Queue;

/**
 * PlayQueue Class
 * @author Jamie Lewis
 */
public class PlayQueue {

	/**
	 * Main Program Loop
	 * @param args
	 */
	public static void main(String[] args) {

		// Create an integer queue
		Queue<Integer> intQ = new LinkedList<Integer>();
		intQ.add(1);
		intQ.add(2);
		intQ.add(3);
		intQ.add(4);
		intQ.add(5);
		
		// Create a string queue
		Queue<String> stringQ = new LinkedList<String>();
		stringQ.add("Jamie");
		stringQ.add("Kat");
		stringQ.add("Xander");
		stringQ.add("Brandon");
		stringQ.add("Brooklyn");
		
		// print size and head element for each queue
		System.out.println("size of intQ is: " + intQ.size() + " and the head element is: " + intQ.peek());
		System.out.println("size of stringQ is: " + stringQ.size() + " and the head element is: " + stringQ.peek());
		
		// print the intQ using toString() method - note: just using "intQ" does the same as "intQ.toString()" 
		System.out.println(intQ.toString());
		
		// iterate though and print the string queue - this method empties the queue
		while(!stringQ.isEmpty()) {
			System.out.println(stringQ.remove());
		}

	}

}
