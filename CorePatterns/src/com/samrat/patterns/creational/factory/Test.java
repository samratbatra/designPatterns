package com.samrat.patterns.creational.factory;

public class Test {

	public static void main(String[] args) {

		PizzaStore pizzaStore = new PizzaStore();
		
		pizzaStore.orderPizza("chicken");
		pizzaStore.orderPizza("veggie");
	}

}
