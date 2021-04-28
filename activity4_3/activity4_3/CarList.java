package activity4_3;

import java.util.ArrayList;
import java.util.List;

public class CarList {
	// a CarList is an ArrayList of Car type objects
	List<Car> carList = new ArrayList<Car>();

	/**
	 * Default Constructor
	 */
	public CarList() {
		this.carList = new ArrayList<Car>();
	}
	
	
	/**
	 * Non-Default Constuctor
	 * @param carList
	 */
	public CarList(List<Car> carList) {
		super();
		this.carList = carList;
	}

	/**
	 * Getter Method
	 * @return carList
	 */
	public List<Car> getCarList() {
		return carList;
	}

	/**
	 * Setter Method
	 * @param carList carList
	 */
	public void setCarList(List<Car> carList) {
		this.carList = carList;
	}

}
