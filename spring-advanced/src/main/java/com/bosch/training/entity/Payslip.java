package com.bosch.training.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Payslip {

	@Id
	private int id;
	
	private String month;
	
	private int salary;
	
	@ManyToOne
	@JoinColumn(name = "emp_id")
	@JsonIgnore
	private Employee employee;

	public Payslip() {
		super();
	}

	public Payslip(int id, String month, int salary) {
		super();
		this.id = id;
		this.month = month;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
}
