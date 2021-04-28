package activity3_2;

/**
 * MyArray Class
 * @author Jamie Lewis
 */
public class MyArray {
	
	/**
	 * printArray Method
	 * @param <E>
	 * @param input
	 */
	public <E> void printArray(E[] input) {
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
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
		
		//Test the printArray method
		MyArray ma = new MyArray();
		System.out.println("intArray contains: ");
		ma.printArray(intArray);
		System.out.println("\ndoubleArray contains:");
		ma.printArray(doubleArray);
		System.out.println("\ncharArray contains:");
		ma.printArray(charArray);		

	}

}
