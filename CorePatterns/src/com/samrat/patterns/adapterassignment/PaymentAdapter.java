package com.samrat.patterns.adapterassignment;

public class PaymentAdapter {
	
	public void pay(int rupees) {
		
		PaymentProcessor paymentProcessor = new PaymentProcessorImpl();
		int dollars = rupees * 64;
		paymentProcessor.pay(dollars);
		
		
	}

}
