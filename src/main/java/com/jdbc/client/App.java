package com.jdbc.client;

import java.sql.SQLException;

import com.jdbc.dao.Databases;
import com.jdbc.dao.DatabasesImpl;
import com.jdbc.entity.Employee;

public class App {

	public static void main(String[] args) throws SQLException {
		Databases db = new DatabasesImpl();

		Employee Manoj = new Employee(9,"Suresh","male",4567);
		db.insertByPS(Manoj);
		db.list();
		//SQL Injection
//		db.getEmployeeByName("rtyu' or 1=1");
		System.out.println("Transaction - Successful");
		
	}

}
