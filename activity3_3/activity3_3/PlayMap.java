package activity3_3;
import java.util.HashMap;
import java.util.Map;

/**
 * PlayMap Class
 * @author Jamie Lewis
 */
public class PlayMap {

	/**
	 * Main Program Loop
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Create a map of integers keyed by integers
		Map<Integer, Integer> intMap = new HashMap<Integer, Integer>();
		intMap.put(1, 1);
		intMap.put(2, 2);
		intMap.put(3, 3);
		intMap.put(4, 4);
		intMap.put(5, 5);
		
		// Create a map of strings keyed by integers
		Map<String, String> stringMap = new HashMap<String, String>();
		stringMap.put("String 1", "One");
		stringMap.put("String 2", "Two");
		stringMap.put("String 3", "Three");
		stringMap.put("String 4", "Four");
		stringMap.put("String 5", "Five");
		
		// Print size and isEmpty for each map
		System.out.println("intMap size is: " + intMap.size() + " and its isEmpty state is: " + intMap.isEmpty());
		System.out.println("stringMap size is: " + stringMap.size() + " and its isEmpty state is: " + stringMap.isEmpty());
		
		// Iterate through the String map
		for(Map.Entry<String, String> m : stringMap.entrySet()) {
			System.out.println("Key: " + m.getKey() + " has value: " + m.getValue());
		}
		
		// remove all elements for each map
		intMap.clear();
		stringMap.clear();
		
		// print a statement if both are now empty to validate that previous lines worked...
		// even though assignment instructions do not ask for it, because it makes sense.
		if(intMap.isEmpty() && stringMap.isEmpty()) {
			System.out.println("intMap and stringMap are now empty.");
		}
		
	}

}
