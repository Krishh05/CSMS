package com.example.registration.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	@Id
	@Column(name="userId",length=45)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	
	@Column(name="hiredate",length=45)
	private int hiredate;
	
	@Column(name="salary",length=45)
	private double salary;
	
	@Column(name="branchId",length=45)
	private float branchId;
	
	@Column(name="status",length=45)
	private String status;

	public Employee(int userId, int hiredate, double salary, float branchId, String status) {
		super();
		this.userId = userId;
		this.hiredate = hiredate;
		this.salary = salary;
		this.branchId = branchId;
		this.status = status;
	}

	public Employee() {
		
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
		return "Employee [userId=" + userId + ", hiredate=" + hiredate + ", salary=" + salary + ", branchId=" + branchId
				+ ", status=" + status + "]";
	}
	
	
	
	
	

}
