package shape;
//import packages and classes to use
import base.ShapeBase;

/**
 * Trapezoid Class
 * @author Jamie Lewis
 */
public class Trapezoid extends ShapeBase {

	// class specific attribute
	private int width2;

	/**
	 * Non-Default Constructor
	 * @param name
	 * @param height
	 * @param width
	 * @param width2
	 */
	public Trapezoid(String name, int height, int width, int width2) {
		super(name, height, width);
		this.width2 = width2;
	}
	
	/**
	 * Override calculateArea() Method
	 */
	@Override
	public int calculateArea() {
		return (width + width2) / 2 * height;
	}

}
