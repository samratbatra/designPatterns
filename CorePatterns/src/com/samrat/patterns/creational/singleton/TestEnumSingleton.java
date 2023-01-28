package com.samrat.patterns.creational.singleton;

public class TestEnumSingleton {

	public static void main(String[] args) {

		EnumSingletonDemo instance = EnumSingletonDemo.INSTANCE;
		System.out.println(instance.getName());
		instance.setName("Samrat");
		System.out.println(instance.getName());
		
		
	}

}
