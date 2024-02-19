package com.app.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EmployeeDto extends UserDto {
	private LocalDate hireDate;
	private double salary;
	private BranchDto branchId;
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public BranchDto getBranchId() {
		return branchId;
	}
	public void setBranchId(BranchDto branchId) {
		this.branchId = branchId;
	}
	
	
	
	
	
}
