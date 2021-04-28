package activity4_3;
import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * DataHandler Class
 * @author Jamie Lewis
 */
public class DataHandler {

	/**
	 * readAllData Method
	 * @return CarList
	 */
	public CarList readAllData() {
		
		CarList cl = new CarList();
		
		try {
			
			cl = new ObjectMapper().readerFor(CarList.class).readValue(new File("data.json"));
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return cl;
	}
	
	/**
	 * writeAllData Method
	 * @param carList
	 */
	public void saveAllData(CarList carList) {
		
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			
			mapper.writerWithDefaultPrettyPrinter().writeValue(new File("data.json"), carList);
			
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
