package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
	public static void main(String[] args) throws IOException {
		//To configure the reading of the file
		FileReader fr = new FileReader("/Users/rishimalani/eclipse-ee/SeleniumAutomationFramework/src/test/resources/configfiles/config.properties");
		
		Properties p = new Properties();
		
		p.load(fr);
		
		//reading the values from the file
		
		System.out.println(p.getProperty("browser"));
		
		System.out.println(p.getProperty("testurl"));
		
	}
}
