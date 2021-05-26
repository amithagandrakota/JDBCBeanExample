package com.sonata.Main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.sonata.DaoImpl.EmpDAOImpl;
import com.sonata.Model.Employee;

public class TestBean {

	public static void main(String[] args) throws SQLException {
		
		Employee e1=new Employee ();
		e1.setEmpID(111);
		e1.setEmpName("akhil");
		e1.setEmpSAL(43679.98);
		
		EmpDAOImpl dao=new EmpDAOImpl();
		int row=dao.save(e1);
		System.out.println("The number of row added " +row);
		
		//List <Employee> l=dao.getData();
		//for(Employee e:l){
			//System.out.println(e.getEmpID()+" "+e.getEmpName()+" "+e.getEmpSAL());
		//}
		/*List<Employee> list=dao.getData();
		 * for(Employee e:list){
		 * System.out.println(e.getEmpID());
		 * System.out.println(e.getEmpName());
		 * System.out.println(e.getEmpSAL());
		 }*/
	}
}
