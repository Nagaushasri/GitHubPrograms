package com.Log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logs {

	
	
	public static Logger Log= Logger.getLogger("Logs");
	
	public static void info(String Message)
	{
		PropertyConfigurator.configure("Log4j.properties");
		
		Log.info(Message);
	}
}




