package base;

/**
 * ShapeBase Class
 * @author Jamie Lewis
 */
public class ShapeBase implements ShapeInterface{

	// Properties
	protected String name;
	protected int height, width, radius;
	
	/**
	 * Non-Default Constructor
	 * @param name
	 * @param height
	 * @param width
	 */
	public ShapeBase(String name, int height, int width) {
		this.name = name;
		this.height = height;
		this.width = width;
	}
	
	/**
	 * Non-Default Constructor for Circles
	 * @param name
	 * @param radius
	 */
	public ShapeBase(String name, int radius) {
		this.name = name;
		this.radius = radius;
	}

	/**
	 * Name Getter
	 * @return name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Override calculateArea() Method
	 */
	@Override
	public int calculateArea() {
		// -1 appearing in console indicates logic error
		return -1;
	}
	
}
