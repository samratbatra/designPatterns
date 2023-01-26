package com.samrat.patterns.templateassignment;

public class DesktopManufacturer extends ComputerManufacturer {

	@Override
	public void addHardDisk() {

		System.out.println("Desktop Hard disk added");
	}

	@Override
	public void addRAM() {

		System.out.println("Desktop RAM added");
	}

	@Override
	public void addKeyboard() {

		System.out.println("Desktop Keyboard added");
	}

}
