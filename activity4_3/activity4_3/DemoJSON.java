package activity4_3;
import java.util.ArrayList;

/**
 * DemoJSON Class
 * @author Jamie Lewis
 */
public class DemoJSON {

	/**
	 * Main Method
	 * @param args
	 */
	public static void main(String[] args){
		
		// DataHandler object to call methods for writing to and reading from a json file
		DataHandler dh = new DataHandler();
		
		// create some car objects
		Car car1 = new Car(2004, "Mitsubishi", "Eclipse", 175000, 3.0d);
		Car car2 = new Car(2018, "Toyota", "86", 15000, 2.0d);
		Car car3 = new Car(2002, "Dodge", "Viper GTS", 33000, 8.0d);
		Car car4 = new Car(2010, "Subaru", "WRX STI", 105000, 2.5d);
		Car car5 = new Car(1990, "Dodge", "Colt", 250000, 1.5d);
		
		// add the cars to an arraylist
		ArrayList<Car> cars = new ArrayList<Car>();
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		cars.add(car5);
		
		// set the arrayList to a new CarList object
		CarList cl = new CarList(); // a carList is an ArrayList 
		cl.setCarList(cars);
		
		// write the list of cars to a file
		dh.saveAllData(cl);
		
		// create a new CarList object and read data from a file to it
		CarList cl2 = new CarList();
		cl2 = dh.readAllData();
		
		// print to the console to show that data is being retrieved from the file
		System.out.println(cl2.getCarList());
		System.out.println(cl2.getCarList().get(2));
	}

}
