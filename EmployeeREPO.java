package com.example.registration.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.registration.Entity.Employee;

public interface EmployeeREPO extends JpaRepository<Employee, Long> {

	


}
