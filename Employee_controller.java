package com.example.registration.EmployeeController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.registration.Dto.EmployeeDTO;
import com.example.registration.Service.employee_service;

@RestController
@CrossOrigin("http://localhost:8080/")
@RequestMapping("api/v1/employee")
public class Employee_controller {
	@Autowired
	private employee_service employee_service;
	
	@PostMapping(path="/save")
	public String saveEmployee(@RequestBody EmployeeDTO EmployeeDTO)
	{
		String id=employee_service.addEmployee(EmployeeDTO);
		return id;
		
	}

}
