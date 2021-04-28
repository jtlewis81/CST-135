package activity4_1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * DemoReadingFiles Class
 * @author Jamie Lewis
 */
public class DemoReadingFiles {

	/**
	 * Main Method
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {

		// File and Scanner objects
		File file = new File("in1.txt");
		Scanner s = new Scanner(file);
		
		// cast values that scanner retrieves from text file to variables
		int i1 = s.nextInt();
		int i2 = s.nextInt();
		
		// print the data
		System.out.println(i1 + " + " + i2 + " = " + (i1 + i2));
		
		// close Scanner
		s.close();		
	}

}

/*
NOTE ON ASSIGNMENT:
The instructions for items 14 - 17 are very incohesive.
The stated expectations do not match up with what we are even told to do.
The nextLine() method does not work as the instructions indicate. It only prints a blank line.
This is in reference to the written instruction, NOT the screenshot images.
This is not to say that I do not understand how the nextLine() method is working.
It is to say that the instructions need a major reworking,
as noted by the above phrase "as the instructions indicate".
*/