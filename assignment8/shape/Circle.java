package shape;
//import packages and classes to use
import base.ShapeBase;

/**
 * Cirlce Class
 * @author Jamie Lewis
 */
public class Circle extends ShapeBase {

	/**
	 * Non-Default Constructor
	 * @param name
	 * @param radius
	 */
	public Circle(String name, int radius) {
		super(name, radius);
	}
	
	/**
	 * Override calculateArea() Method
	 */
	@Override
	public int calculateArea() {
		// returns the approximate area of a circle by rounding off to an integer
		return (int) (Math.PI * radius * radius);
	}

}
