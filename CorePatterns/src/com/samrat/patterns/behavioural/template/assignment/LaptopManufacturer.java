package com.samrat.patterns.behavioural.template.assignment;

public class LaptopManufacturer extends ComputerManufacturer {

	@Override
	public void addHardDisk() {

		System.out.println("Laptop Hard disk added");
	}

	@Override
	public void addRAM() {

		System.out.println("Laptop RAM added");
	}

	@Override
	public void addKeyboard() {

		System.out.println("Laptop Keyboard added");
	}

}
