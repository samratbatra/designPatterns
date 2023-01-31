package com.samrat.patterns.structural.facade;

public class OrderFacade {

	public void processOrder(String item, int quantity) {
		OrderProcessor processor = new OrderProcessor();
		if (processor.checkStore(item)) {
			String orderId = processor.placeOrder(item, quantity);
			processor.shipOrder(orderId);
		}
	}

}
