package com.samrat.patterns.structural.facade;

public class Test {

	public static void main(String[] args) {
		
		OrderFacade orderFacade = new OrderFacade();
		orderFacade.processOrder("Macbook", 5);
				

	}

}
