package com.samrat.patterns.abstractfactory;

public class DBEmpDao implements Dao {

	@Override
	public void save() {

		System.out.println("Saving department to DB");
	}

}
