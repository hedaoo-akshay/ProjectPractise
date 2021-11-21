package com.vtiger.genericLib;

import java.io.FileInputStream;
import java.util.Properties;


public class PropertyUtilityFile {
	
	public String readDataFromPropertyFile(String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream(IPathConstants.PROP_PATH);
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}

}
