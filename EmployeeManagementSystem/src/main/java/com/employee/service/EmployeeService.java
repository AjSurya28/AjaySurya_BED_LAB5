package com.employee.service;

import java.util.List;

import com.employee.entity.Employee;

public interface EmployeeService {
	
	
	public List<Employee> findAll();
	
	
	public void save(Employee theEmployee);
	

	public void deleteById(int id);

	public Employee findById(int id);

}
