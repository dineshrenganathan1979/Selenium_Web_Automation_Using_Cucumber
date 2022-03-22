package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private static Properties prop;
	private static String loginURL;
	private static String contactsPageURL;

	/**
	 * This method is used to load the properties from config.properties file
	 * @return it returns Properties prop object
	 */
	public static Properties init_prop() {

		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("./src/test/resources/config/config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return prop;

	}
	
	public static String getLoginURL(){
		return prop.getProperty("loginPageUrl");
	}
	
	public static String getContactsPageURL(){
		return prop.getProperty("contactsPageUrl");
		
	}

}
