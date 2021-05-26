package com.sonata.Dao;

import java.sql.SQLException;
import java.util.List;

import com.sonata.Model.Employee;

public interface EmpDao {
	
	public int save(Object object);
	public List<Employee> getData();
	//public int delete (Object object);
	//public int update (Object object);

}
