package com.practice.helper;

import java.io.IOException;
import java.util.Properties;

import com.practice.constants.FileConstant;

/**
 * Find locator class
 * 
 * @author Mohit.Jaiswal
 *
 */
public class PropertyFileLoader {
	CommonUtility common = new CommonUtility();

    Properties config;

	
   
	public PropertyFileLoader() {

	try {

		// load the property file config.properties
		config = common.propertyFileLoad(FileConstant.CONFIG_FILE);
	} catch (IOException e) {
		e.getMessage();
	
	}

	

	
	
	
	
	
}
	
	
	
	
	

	
	

	

	/**
	 * method-getproperty
	 * 
	 * @param key
	 * @return
	 */
	
	public String getConfig(String key) {
		String value = config.getProperty(key);
		return value;

	}

	
	
	
	
	
}
