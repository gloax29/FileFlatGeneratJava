package com.fileflat.positional.log;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;




public class OneLogClass {
	private static OneLogClass instance ;

	private OneLogClass(){
		
		initializeLog4j();
		
	}
	
	
	public static Logger getInstlogger(Class clazz) {
		if(instance == null){
			
			instance = new OneLogClass();
		}
		
		return Logger.getLogger(clazz); 
		
	}
	
	
	
	
	
	private void initializeLog4j() {

		// Initializes logging
		/*
		 * 
		 * TRACE, DEBUG, INFO, WARN, ERROR and FATAL
		 */
		Properties prop = new Properties();
		prop.put("log4j.rootLogger", "DEBUG, stdout");
		prop.put("log4j.appender.stdout", "org.apache.log4j.FileAppender");
		//prop.put("log4j.appender.File", "filesLog/Initializes.log");
		prop.put("log4j.appender.stdout", "org.apache.log4j.ConsoleAppender");
		prop.put("log4j.appender.stdout.layout",
				"org.apache.log4j.PatternLayout");
		prop.put("log4j.appender.stdout.layout.ConversionPattern",
				"%d %-5p [%t] (%F:%L) (%c{1}) : %m%n");
		// "%5p (%F:%L) (%c{1}) - %m%n");
		PropertyConfigurator.configure(prop);
		
		 
	}
	
	

}
