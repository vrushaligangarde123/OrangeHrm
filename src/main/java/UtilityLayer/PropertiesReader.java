package UtilityLayer;

import java.io.FileReader;

import java.util.Properties;

public class PropertiesReader {
	public static String getProperty(String keyname) {
		Properties prop=new Properties();
		String path=System.getProperty("user.dir")+"/src/main/resources/ConfigurationLayer/cofig.properties";
		try {
			FileReader file=new FileReader(path);
			prop.load(file);
			return prop.getProperty(keyname);
			
		}catch(Exception e) {
		
	}
		return null;
	}

}
