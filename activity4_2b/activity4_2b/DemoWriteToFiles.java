package activity4_2b;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DemoWriteToFiles {

	public static void main(String[] args) throws IOException{
		
/*		
		Activity4_2a Code
		
		// Create a File, FileWriter, and PrintWriter objects
		
		File file = new File("output.txt");
		FileWriter fw = new FileWriter(file, true);
		PrintWriter pw = new PrintWriter(fw);
		
		pw.println("Line4");
		pw.println("Line5");
		pw.println("Line6");
		
		// close the FileWriter to save the data to the File
		fw.close();
*/
		
		// NEW CODE
		
		// create array of car class ogjects
		Car[] cars = new Car[5];
		cars[0] = new Car(2004, "Mitsubishi", "Eclipse", 175000, 3.0d);
		cars[1] = new Car(2018, "Toyota", "86", 15000, 2.0d);
		cars[2] = new Car(2002, "Dodge", "Viper GTS", 33000, 8.0d);
		cars[3] = new Car(2010, "Subaru", "WRX STi", 105000, 2.5d);
		cars[4] = new Car(1990, "Dodge", "Colt", 250000, 1.5d);
		
		// loop through the car array and save the information for each car on one line of a text file using saveToFile()
		for(int i = 0; i < cars.length; i++) {
			String data = Integer.toString(cars[i].getYear()) + "|" + cars[i].getMake() + "|" + cars[i].getModel() + "|" + Integer.toString(cars[i].getOdometer()) + "|" + Double.toString(cars[i].getEngineLiters());
			saveToFile("data.txt", data, true);
		}
		
		// retrieve the information from the File and save it to a new array, then print the new array to the console.
		ArrayList<Car> savedCars = new ArrayList<Car>(readFromFile("data.txt"));
		for(int x = 0; x < savedCars.size(); x++) {
			System.out.println(savedCars.get(x).getYear() + " " + savedCars.get(x).getMake() + " " + savedCars.get(x).getModel() + " - " + savedCars.get(x).getOdometer() + " miles - " + savedCars.get(x).getEngineLiters() + " liter engine");
		}
		
	}

	/**
	 * saveToFile Method
	 * @param file
	 * @param data
	 * @param append
	 */
	public static void saveToFile(String file, String data, boolean append) {
		try {
				
			File f = new File(file);
			FileWriter fw = new FileWriter(f, append);
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println(data);
			fw.close();
			
			} catch (IOException e) {
				System.out.println("ERROR in: saveToFile()");
		}
	}
	
	/**
	 * readFromFile Method
	 * @param fileName
	 * @return ArrayList<Car>
	 * @throws FileNotFoundException
	 */
	public static ArrayList<Car> readFromFile(String fileName) throws FileNotFoundException{
		
		File file = new File(fileName);
		Scanner input = new Scanner(file);

		ArrayList<Car> cars = new ArrayList<Car>();
		while(input.hasNextLine()) {
			String car = input.nextLine();
			String[] specs = car.split("\\|");
			int year = Integer.valueOf(specs[0]);
			String make = specs[1];
			String model = specs[2];
			int odometer = Integer.parseInt(specs[3]);
			double engineLiters = Double.parseDouble(specs[4]);
			
			Car c = new Car(year, make, model, odometer, engineLiters);
			cars.add(c);
		}
		
		input.close();
		return cars;
	}

}
