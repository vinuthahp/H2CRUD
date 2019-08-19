package com.tm.H2CRUD.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tm.H2CRUD.entity.Employee;
import com.tm.H2CRUD.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	@PostMapping(value="/add",consumes=MediaType.APPLICATION_JSON_VALUE)
	public String addEmployee(@RequestBody Employee employee)
	{
		return service.saveEmployee(employee);
		
	}
	@GetMapping(value="/get",produces=MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployee(@RequestParam String name)
	{
		return service.searchEmployee(name);
		
	}

}
