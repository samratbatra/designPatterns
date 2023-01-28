package com.samrat.patterns.creational.singleton.assignment;

public class LoggerTest {

	public static void main(String[] args) {

		Logger logger = Logger.getInstance();
		
		logger.log("Log Entry 1");
		logger.log("Log Entry 2");
	}

}

