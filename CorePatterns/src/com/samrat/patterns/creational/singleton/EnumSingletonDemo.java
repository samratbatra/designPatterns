package com.samrat.patterns.creational.singleton;

public enum EnumSingletonDemo {
	
	INSTANCE;
	
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
