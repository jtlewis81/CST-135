package activity3_2;

/**
 * MyNumberArray Class
 * @author Jamie Lewis
 */
public class MyNumberArray {
	/**
	 * printArray Method
	 * @param <E>
	 * @param input
	 */
	public <E extends Number> void printArray(E[] input) {
		for(E element : input) {
			System.out.printf("%s ", element);
		}
	}

	/**
	 * Main Program Loop
	 * @param args
	 */
	public static void main(String[] args) {

		// Create various types of arrays
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Float[] floatArray = { 0.0f, 1.0f, 2.5f, 3.5f };
		
		//Test the printArray method
		MyNumberArray ma = new MyNumberArray();
		System.out.println("intArray contains: ");
		ma.printArray(intArray);
		System.out.println("\ndoubleArray contains:");
		ma.printArray(doubleArray);
		System.out.println("\nfloatArray contains:");
		ma.printArray(floatArray);		

	}

}
