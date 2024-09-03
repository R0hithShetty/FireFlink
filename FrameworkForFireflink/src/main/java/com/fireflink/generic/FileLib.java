package com.fireflink.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class FileLib {
	public String getDataProperties(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./data/commondata.properties");
		Properties p=new Properties();
		p.load(fis);
	    String Data = p.getProperty(key);
	    return Data;
		
	}

}
