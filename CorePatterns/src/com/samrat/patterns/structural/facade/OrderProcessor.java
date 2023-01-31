package com.samrat.patterns.structural.facade;

public class OrderProcessor {
	
	public boolean checkStore(String name) {
		
		System.out.println("Checking stock");
		return true;
	}
	
	public String placeOrder(String name, int quantity) {
		System.out.println("Order Placed");
		return "abc";
	}
	
	public void shipOrder(String orderId) {
		System.out.println("Order");
	}

}
