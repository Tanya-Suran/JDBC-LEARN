package com.jdbc.dao;

import java.sql.SQLException;

import com.jdbc.entity.Employee;

public interface Databases {
	
	public void insert(Employee e);
	public void insertByPS(Employee e)throws SQLException;
	public void update(Employee e);
	public void delete(Employee e);
	public void list() throws SQLException;
	public void getEmployeeById();
	public void getEmployeeByName(String name)throws SQLException;
	
	
}
