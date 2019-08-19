package com.tm.H2CRUD.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tm.H2CRUD.entity.Employee;
import com.tm.H2CRUD.repo.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo repo;
	
	public String saveEmployee(Employee employee)
	{
		return repo.save(employee) !=null ?"Employee saved !!!":"Employee Not saved!!!!";
	}
	public Employee searchEmployee(String name)
	{
		return repo.getEmployeeByName(name);
	}

}
