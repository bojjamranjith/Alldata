package com.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class OrangeHRMProperty {
	
	

	public static Properties loadProperty() throws IOException
	
	{
		FileInputStream OHRMApplicationPropertiesFile= new FileInputStream("D:\\ECLIPS WORK SPACE\\com.OrangeHRMAppilication\\src\\main\\java\\com\\config\\OrangeHRMApplication.properties");
		Properties properties =new Properties();
		properties.load(OHRMApplicationPropertiesFile);
				
		return properties;
		
	}

}
