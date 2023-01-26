package com.samrat.patterns.factory;

public class VeggiePizza implements Pizza {

	@Override
	public void prepare() {
System.out.println("Preparing Veggie pizza");
	}

	@Override
	public void bake() {
		System.out.println("Baking Veggie pizza");
	}

	@Override
	public void cut() {
		System.out.println("Cutting Veggie pizza");
	}

}
