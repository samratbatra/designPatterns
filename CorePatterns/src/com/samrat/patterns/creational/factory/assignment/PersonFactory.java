package com.samrat.patterns.creational.factory.assignment;

public class PersonFactory {
	
	public static Person getPerson(String gender) {
		
		Person p=null;
		
		if(gender.equals("male")) {
			p = new Male();
		}else if(gender.equals("female")) {
			p = new Female();
		}
		
		return p;
	}

}
