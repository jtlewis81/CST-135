package activity3_3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * PlayList Class
 * @author Jamie Lewis
 */
public class PlayList {

	/**
	 * Main Program Loop
	 * @param args
	 */
	public static void main(String[] args) {

		// create a List of integers with 5 elements
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(3);
		intList.add(7);
		intList.add(8);
		intList.add(12);
		
		// create a List of strings with 5 elements
		List<String> stringList = new ArrayList<String>();
		stringList.add("String One");
		stringList.add("String Two");
		stringList.add("String Red");
		stringList.add("String Blue");
		stringList.add("My String");
		
		// print the first element of each List
		System.out.println("First intList element: " + intList.get(0));
		System.out.println("First stringList element: " + stringList.get(0));
		
		// iterate through the integer List with a for loop
		for(int i = 0; i < intList.size(); i++) {
			int index = i + 1;
			System.out.println("intList element #" + index + ": " + intList.get(i));
		}
		
		// iterate through the string List with a while loop
		Iterator<String> stringIterator = stringList.iterator();
		while(stringIterator.hasNext()) {
			System.out.println("stringList element: " + stringIterator.next());
		}
		
	}

}
