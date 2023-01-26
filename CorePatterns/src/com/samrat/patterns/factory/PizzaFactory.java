package com.samrat.patterns.factory;

public class PizzaFactory {

	public static Pizza  createPizza(String type) {
		Pizza p = null;
		
		if(type.equals("cheeze")) {
			p = new CheezePizza();
		} else if(type.equals("chicken")) {
			p = new ChickenPizza();
		}else if(type.equals("veggie")) {
			p = new VeggiePizza();
		}
		
		return p;
		
	}
	
}
