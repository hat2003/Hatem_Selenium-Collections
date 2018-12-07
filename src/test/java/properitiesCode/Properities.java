package properitiesCode;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Properities {
	
	
	public Properties getProp() throws Exception {

		Properties prop = new Properties();
		InputStream stream = new FileInputStream("src/main/java/Location of the file");
		prop.load(stream);
		return prop;

	}
	
	/*
	 * in the test we write 
	 * Properties prop = getProp();
	 * prop.getProperty("Name")
	 * 
	 */

}
