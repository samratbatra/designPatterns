package com.samrat.patterns.structural.adapter.assignment;

public class PaymentAdapter {
	
	public void pay(int rupees) {
		
		PaymentProcessor paymentProcessor = new PaymentProcessorImpl();
		int dollars = rupees * 64;
		paymentProcessor.pay(dollars);
		
		
	}

}
