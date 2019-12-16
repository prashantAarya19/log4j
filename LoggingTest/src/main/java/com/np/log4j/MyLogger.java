package com.np.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyLogger {
	
	final static Logger logger = LogManager.getLogger(MyLogger.class);
	
	public static void main(String[] args) {
		logger.warn("this is warn log");
		logger.fatal("this is fatal log");
		System.out.println("logs");
	}

}
