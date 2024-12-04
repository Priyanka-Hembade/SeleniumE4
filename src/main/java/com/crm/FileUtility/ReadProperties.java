package com.crm.FileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	
	public static String property(String key) throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\\\qspiders\\\\com.crm.AdvanceSelenium\\\\src\\\\test\\\\resources\\\\login_properties");
		prop.load(fis);
		String data = prop.getProperty(key);
		return data;
	}
	

}
