package shape;
//import packages and classes to use
import base.ShapeBase;

/**
 * Rectangle Class
 * @author Jamie Lewis
 */
public class Rectangle extends ShapeBase{

	/**
	 * Non-Default Constructor
	 * @param name
	 * @param height
	 * @param width
	 */
	public Rectangle(String name, int height, int width) {
		super(name, height, width);
	}
	
	/**
	 * Override calculateArea() Method
	 */
	@Override
	public int calculateArea() {
		return width * height;
	}

}
