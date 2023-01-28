package com.samrat.patterns.behavioural.template.assignment;

public class Test {

	public static void main(String[] args) {

		ComputerManufacturer computerManufacturer = new LaptopManufacturer();
		computerManufacturer.buildComputer();
		
		computerManufacturer = new DesktopManufacturer();
		computerManufacturer.buildComputer();
	}
	

}
