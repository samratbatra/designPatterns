package com.samrat.patterns.creational.abstractfactory;

public class Test {

	public static void main(String[] args) {

		DaoAbstractFactory daf = DaoFactoryProducer.produce("xml");
		Dao dao = daf.createDao("emp");
		dao.save();
		dao = daf.createDao("dept");
		dao.save();
		
		daf = DaoFactoryProducer.produce("db");
		dao = daf.createDao("emp");
		dao.save();
		dao = daf.createDao("dept");
		dao.save();
	}

}
