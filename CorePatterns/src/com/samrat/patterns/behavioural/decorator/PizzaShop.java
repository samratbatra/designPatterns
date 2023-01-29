package com.samrat.patterns.behavioural.decorator;

public class PizzaShop {

	public static void main(String[] args) {

		Pizza pizza = new PlainPizza();
		pizza.bake();
		Pizza pizza1 = new CheesePizzaDecorator(pizza);
		pizza1.bake();
		Pizza pizza2 = new VeggiePizzaDecorator(pizza1);
		pizza2.bake();
	}

}
