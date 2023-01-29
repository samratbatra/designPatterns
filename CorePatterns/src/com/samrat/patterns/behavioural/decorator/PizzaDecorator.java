package com.samrat.patterns.behavioural.decorator;

public class PizzaDecorator implements Pizza {

	public Pizza pizza;
	
	public PizzaDecorator(Pizza pizza) {
		
		this.pizza = pizza;
	}
	@Override
	public void bake() {
		pizza.bake();

		
	}

}
