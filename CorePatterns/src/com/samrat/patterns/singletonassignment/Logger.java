package com.samrat.patterns.singletonassignment;

public class Logger implements Cloneable{
	
	
	private static volatile Logger instance;
	
	private Logger() {
		
	}

	public static Logger getInstance() {
		if(instance == null) {
			synchronized (Logger.class) {
				if(instance == null) {
					instance =  new Logger();
				}	
			}
		}
				
		return instance;
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	public void log(String msg) {
		System.out.println(msg);
	}
	

}
