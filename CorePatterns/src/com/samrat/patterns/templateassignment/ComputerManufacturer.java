package com.samrat.patterns.templateassignment;

public abstract class ComputerManufacturer {
	
	public void buildComputer() {
		
		addHardDisk();
		addRAM();
		addKeyboard();
		
	}
	
	public abstract void addHardDisk();
	
	public abstract void addRAM();
	
	public abstract void addKeyboard();

}
