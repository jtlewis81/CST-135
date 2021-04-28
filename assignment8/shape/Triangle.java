package shape;
//import packages and classes to use
import base.ShapeBase;

/**
 * Triangle Class
 * @author Jamie Lewis
 */
public class Triangle extends ShapeBase{

	/**
	 * Non-Default Constructor
	 * @param name
	 * @param height
	 * @param width
	 */
	public Triangle(String name, int height, int width) {
		super(name, height, width);
	}
	
	/**
	 * Override calculateArea() Method
	 */
	@Override
	public int calculateArea() {
		return width * height / 2;
	}

}
