package org.jdbcdao.learn;

//
//https://www.geeksforgeeks.org/jdbc-using-model-object-and-singleton-class/
//

//Creating a MySQL database and a table:
// create database org;
// use org;
// create table employee(
//    emp_id int auto_increment,
//    emp_name varchar(400),
//    emp_address varchar(400),
//    primary key (emp_id)
//);

import java.sql.SQLException;
import java.util.List;


public class Application {

	public static void main(String[] args)
		throws SQLException
	{

		Employee emp = new Employee();
		emp.setEmp_name("Haider");
		emp.setEmp_address("Mars");
		EmployeeDaoImplementation empDao
			= new EmployeeDaoImplementation();

		// add
		//empDao.add(emp);

		// read
		Employee e = empDao.getEmployee(4);
		System.out.println(e.getEmp_id() + " "
						+ e.getEmp_name() + " "
						+ e.getEmp_address());

		// read All
		List<Employee> ls = empDao.getEmployees();
		for (Employee allEmp : ls) {
			System.out.println(allEmp);
		}

		// update
		//Employee tempEmployee = empDao.getEmployee(1);
		//tempEmployee.setEmp_address("Asgard");
		//empDao.update(tempEmployee);

		// delete
		//empDao.delete(1);
	}
}

