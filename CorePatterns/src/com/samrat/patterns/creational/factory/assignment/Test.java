package com.samrat.patterns.creational.factory.assignment;

public class Test {

	public static void main(String[] args) {

		PersonPicker personPicker = new PersonPicker();
		personPicker.pickPerson("male");
		personPicker.pickPerson("female");
	}

}
