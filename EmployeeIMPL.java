package com.example.registration.Service.IMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.registration.Dto.EmployeeDTO;
import com.example.registration.Entity.Employee;
import com.example.registration.Repo.EmployeeREPO;
import com.example.registration.Service.employee_service;

@Service
public class EmployeeIMPL implements employee_service {
	@Autowired
	private EmployeeREPO employeerepo;

	@Override
	public String addEmployee(EmployeeDTO employeeDTO) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		
			
				employee.setUserId(employeeDTO.getUserId());
			    employee.setHiredate(employeeDTO.getHiredate());
			    employee.setSalary(employeeDTO.getSalary());
			    employee.setBranchId(employeeDTO.getBranchId());
			    employee.setStatus(employeeDTO.getStatus());
			    
			    employeerepo.save(employee);
		
		return "Employee add successfully";
	}

}
