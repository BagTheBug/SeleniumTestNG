package com.retail.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {
	Properties p = new Properties();
	static String result = "";
	public static FileInputStream inputStream;

	public Properties loadProperty(String file) {
		FileInputStream propFile = null;
		try {
			propFile = new FileInputStream(file);
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			try {
				propFile = new FileInputStream("src/test/resources/" + file);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			p.load(propFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("File Not Found");
		}
		return p;
	}

	public String getData(String wantedPropertyValue) throws IOException {

		try {
			Properties prop = new Properties();
			String propFileName = "src/test/resources/data/RetailData.properties";

			inputStream = new FileInputStream(new File(propFileName));
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("Data File '" + propFileName + "' not found in the classpath");
			}

			result = prop.getProperty(wantedPropertyValue);

		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			inputStream.close();
		}
		return result;
	}
}
