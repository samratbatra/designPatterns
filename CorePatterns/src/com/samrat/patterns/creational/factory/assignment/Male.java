package com.samrat.patterns.creational.factory.assignment;

public class Male implements Person {

	@Override
	public void wish(String msg) {

		System.out.println(msg + "-Male");
	}

}
