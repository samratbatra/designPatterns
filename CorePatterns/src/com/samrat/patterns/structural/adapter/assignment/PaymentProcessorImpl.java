package com.samrat.patterns.structural.adapter.assignment;

public class PaymentProcessorImpl implements PaymentProcessor {

	@Override
	public void pay(int dollars) {
		System.out.println(dollars);

	}

}
