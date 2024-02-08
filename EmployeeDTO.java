package com.example.registration.Dto;



public class EmployeeDTO {
	
	private int userId;
	private int hiredate;
	private double salary;
	private float branchId;
	private String status;
	
	public EmployeeDTO(int userId, int hiredate, double salary, float branchId, String status) {
		super();
		this.userId = userId;
		this.hiredate = hiredate;
		this.salary = salary;
		this.branchId = branchId;
		this.status = status;
	}

	public EmployeeDTO() {
		
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getHiredate() {
		return hiredate;
	}

	public void setHiredate(int hiredate) {
		this.hiredate = hiredate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public float getBranchId() {
		return branchId;
	}

	public void setBranchId(float branchId) {
		this.branchId = branchId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [userId=" + userId + ", hiredate=" + hiredate + ", salary=" + salary + ", branchId="
				+ branchId + ", status=" + status + "]";
	}
	
	
	
	
}
