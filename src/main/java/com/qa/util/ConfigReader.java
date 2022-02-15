package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private Properties prop;
	// This method is used to load the properties from the config.properties file
	
	public Properties init_prop() {
	
	prop = new Properties();
	try {
		FileInputStream ip = new FileInputStream("./src/test/resources/Config/Config.properties");
		prop.load(ip);
		System.out.println("Config Property file have been loaded successfully");
		}
	catch (FileNotFoundException e)
	{
		e.printStackTrace();
	}
	catch (IOException io)
	{
		io.printStackTrace();
	}
	return prop;
}
}

