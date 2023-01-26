package com.samrat.patterns.adapter;

public class WeatherAdapter {
	
	public int findTemperature(int zipcode) {
		
		String city= null;
		
		if(zipcode == 132103) {
			city = "Panipat";
		}
		
		WeatherFinder finder = new WeatherFinderImpl();
		int temperature = finder.find(city);
		
		return temperature;
		
	}

}
