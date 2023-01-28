package com.samrat.patterns.structural.adapter.assignment;

public class PaymentApp {

	public static void main(String[] args) {
		
		PaymentApp paymentApp = new PaymentApp();
		paymentApp.pay(3);

	}
	
	public void pay(int rupees) {
		
		PaymentAdapter paymentAdapter = new PaymentAdapter();
		paymentAdapter.pay(rupees);
	}

}
