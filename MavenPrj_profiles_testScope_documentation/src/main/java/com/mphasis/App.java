package com.mphasis;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        
    	Properties p=new Properties();
    	try(InputStream in=App.class.getClassLoader()
    			.getResourceAsStream("application.properties")){
    		p.load(in);
    	}
    	System.out.println("Active Profile: "+p.getProperty("profile"));
    	Calculator c=new Calculator();
    	System.out.println(c.add(5, 6));
    }
}
