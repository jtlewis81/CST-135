package activity3_2;

/**
 * Storage Class (Generic)
 * @author Jamie Lewis
 * @param <T>
 */
public class Storage<T> {
	
	//Private Class Member
	private T s = null;
	
	/**
	 * Non-Default Constructor
	 * @param s
	 */
	public Storage(T s) {
		this.s = s;
	}
	
	/**
	 * Getter method for s
	 * @return
	 */
	public T getData() {
		return this.s;
	}

	/**
	 * Main Program Loop
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Create some instances of Storage objects and then call the getData() method on them.
		Storage<String> storage_string = new Storage<String>("Jamie Lewis");
		System.out.println("This is the data in storage_string: " + storage_string.getData());
		Storage<Integer> storage_int = new Storage<Integer>(39);
		System.out.println("This is the data in storage_int: " + storage_int.getData());
		

	}

}
