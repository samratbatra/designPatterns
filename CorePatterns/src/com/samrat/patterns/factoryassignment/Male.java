package com.samrat.patterns.factoryassignment;

public class Male implements Person {

	@Override
	public void wish(String msg) {

		System.out.println(msg + "-Male");
	}

}
