package com.samrat.patterns.factoryassignment;

public class PersonPicker {
	
	
	public Person pickPerson(String gender) {
		
		Person p=PersonFactory.getPerson(gender);
		
		p.wish("Gender");
		
		return p;
	}

}
