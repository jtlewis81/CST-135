package activity3_3;
import java.util.Stack;
import java.util.Iterator;

/**
 * PlayStack Class
 * @author Jamie Lewis
 */
public class PlayStack {

	/**
	 * Main Program Loop
	 * @param args
	 */
	public static void main(String[] args) {

		// Create an integer stack
		Stack<Integer> intS = new Stack<Integer>();
		intS.push(1);
		intS.push(2);
		intS.push(3);
		intS.push(4);
		intS.push(5);
		
		// Create a string stack
		Stack<String> stringS = new Stack<String>();
		stringS.push("Jamie");
		stringS.push("Kat");
		stringS.push("Xander");
		stringS.push("Brandon");
		stringS.push("Brooklyn");
		
		// print size and 2nd element for each stack
		System.out.println("size of intS is: " + intS.size() + " and the 2nd element is: " + intS.elementAt(1));
		System.out.println("size of stringS is: " + stringS.size() + " and the 2nd element is: " + stringS.elementAt(1));
		
		// print the intS using toString() method 
		System.out.println(intS.toString());
		
		// iterate though and print the string stack
		Iterator<String> stringIterator = stringS.iterator();
		while(stringIterator.hasNext()) {
			System.out.println(stringS.pop());
		}

	}

}
