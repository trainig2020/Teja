package com.spring.dao;

import java.util.List;

import com.spring.model.Employee;





public interface EmployeeDao {
	

	public void insertEmployee(Employee emp);

	public void updateEmployee(Employee emp);

	public void deleteEmployee(int id);

	public Employee getEmployees(int id);

	public List<Employee> getAllEmployees();


}
