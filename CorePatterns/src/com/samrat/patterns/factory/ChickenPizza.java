package com.samrat.patterns.factory;

public class ChickenPizza implements Pizza {

	@Override
	public void prepare() {
System.out.println("Preparing Chicken pizza");
	}

	@Override
	public void bake() {
		System.out.println("Baking Chicken pizza");
	}

	@Override
	public void cut() {
		System.out.println("Cutting Chicken pizza");
	}

}
