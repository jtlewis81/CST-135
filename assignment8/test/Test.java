package test;
//import packages and classes to use
import base.ShapeBase;
import shape.*;

/**
 * Test "Driver" Program
 * @author Jamie Lewis
 */
public class Test {

	/**
	 * DisplayArea Helper Method
	 * @param shape
	 */
	private static void displayArea(ShapeBase shape) {
		System.out.println("The " + shape.getName() + " has an area of " + shape.calculateArea() + ".");
	}

	/**
	 * Main Program Loop
	 * @param args
	 */
	public static void main(String[] args) {

		// instantiate array of shape objects
		ShapeBase[] shapes = new ShapeBase[4];
		shapes[0] = new Triangle("Triangle", 20,30);
		shapes[1] = new Rectangle("Rectangle", 20,30);
		shapes[2] = new Trapezoid("Trapezoid", 10, 20, 30);
		shapes[3] = new Circle("Circle", 5);
		// loop through shapes array and run displayArea() on each one.
		for(int i = 0; i < shapes.length; i++) {
			displayArea(shapes[i]);
		}
	}
}
