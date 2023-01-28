package com.samrat.patterns.creational.abstractfactory;

public class DBDeptDao implements Dao {

	@Override
	public void save() {

		System.out.println("Saving department to DB");
	}

}
