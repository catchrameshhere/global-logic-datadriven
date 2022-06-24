package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;



public class ReadFile {

	public Properties readPropertiesFile(String fileName) {
		FileReader fr;
		Properties prop = null;
		
		try {
			fr = new FileReader(fileName);
			prop = new Properties();
			prop.load(fr);
		}
		catch (FileNotFoundException e) {
			System.out.println("File is not found in the given location");
		}
		catch (IOException e) {
			System.out.println("Unable to load the properties file contents");
		}

		return prop;
	}

}
