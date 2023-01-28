package com.samrat.patterns.structural.adapter;

public class WeatherUI {

	public void showTemperature(int zipcode) {
		
		WeatherAdapter adapter = new WeatherAdapter();
		System.out.println(adapter.findTemperature(zipcode));
	}
	
	public static void main(String[] args) {
		WeatherUI weatherUI = new WeatherUI();
		weatherUI.showTemperature(132103);
	}
}
