package com.samrat.patterns.behavioural.decorator;

public class VeggiePizzaDecorator extends PizzaDecorator {

	public VeggiePizzaDecorator(Pizza pizza) {
		super(pizza);
		
	}
	
	public void bake() {
		super.bake();
		System.out.println("Adding Cheese toppings");
	}

}
