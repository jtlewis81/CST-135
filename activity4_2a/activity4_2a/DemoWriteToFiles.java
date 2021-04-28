package activity4_2a;

import java.io.*;

public class DemoWriteToFiles {

	public static void main(String[] args) throws IOException{
		
		// Create a File, FileWriter, and PrintWriter objects
		
		File file = new File("output.txt");
		FileWriter fw = new FileWriter(file, true);
		PrintWriter pw = new PrintWriter(fw);
		
		pw.println("Line4");
		pw.println("Line5");
		pw.println("Line6");
		
		// close the FileWriter to save the data to the File
		fw.close();
	
	}

}
