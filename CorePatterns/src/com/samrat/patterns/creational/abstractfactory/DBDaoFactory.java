package com.samrat.patterns.creational.abstractfactory;

public class DBDaoFactory extends DaoAbstractFactory {

	@Override
	public Dao createDao(String type) {

		Dao dao = null;
		
		if(type.equals("emp")) {
			dao = new XMLEmpDao();
		}else if(type.equals("dept")) {
			dao = new XMLDeptDao();
		}
		return dao;
	}

}
