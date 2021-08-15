package testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromPropFile {

	public static void main(String[] args) throws IOException  {
		FileInputStream fs = new FileInputStream("./src/main/resources/config.properties");
		Properties prop = new Properties();
		prop.load(fs);
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		
		

	}

}
