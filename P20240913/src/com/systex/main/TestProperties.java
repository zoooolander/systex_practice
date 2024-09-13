package com.systex.main;

import java.util.Enumeration;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties properties = System.getProperties();
		Enumeration propNames = properties.propertyNames();
		while (propNames.hasMoreElements()) {
			String propName = (String) propNames.nextElement();
			String propValue = properties.getProperty(propName);
			System.out.println(propName + " = " + propValue);
		}
		System.out.println("====================");
		System.out.println(System.getProperty("file.separator"));
		System.out.println(System.getProperty("path.separator"));
	}

}
