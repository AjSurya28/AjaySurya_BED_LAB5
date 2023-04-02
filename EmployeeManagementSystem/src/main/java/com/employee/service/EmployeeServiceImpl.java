package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeRepository;
import com.employee.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository EmployeeRepository;
	
	@Override
	public List<Employee> findAll() {
		return EmployeeRepository.findAll();
	}

	@Override
	public void save(Employee theEmployee) {
		EmployeeRepository.save(theEmployee);
	}

	@Override
	public void deleteById(int id) {
		EmployeeRepository.deleteById(id);
	}

	@Override
	public Employee findById(int id) {
		Employee employee = EmployeeRepository.findById(id).get();
		
		if(employee == null)
			throw new RuntimeException("Did not find the Employee id: " + id);
		else
			return employee;
			
	}

}
