package com.samrat.patterns.factoryassignment;

public class Test {

	public static void main(String[] args) {

		PersonPicker personPicker = new PersonPicker();
		personPicker.pickPerson("male");
		personPicker.pickPerson("female");
	}

}
