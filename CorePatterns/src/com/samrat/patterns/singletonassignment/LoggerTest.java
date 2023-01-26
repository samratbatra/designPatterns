package com.samrat.patterns.singletonassignment;

public class LoggerTest {

	public static void main(String[] args) {

		Logger logger = Logger.getInstance();
		
		logger.log("Log Entry 1");
		logger.log("Log Entry 2");
	}

}

