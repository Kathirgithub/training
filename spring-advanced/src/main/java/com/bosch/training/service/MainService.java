package com.bosch.training.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosch.training.entity.Employee;
import com.bosch.training.repo.MainRepo;

@Service
@Transactional
public class MainService {

	@Autowired
	private MainRepo repo;
	
	public Employee createEmployee(Employee emp) {
		emp= repo.save(emp);
		if(emp.getId() < 1) {
			throw new RuntimeException("Employee Id "+emp.getId()+" is invalid");
		} else {
			return emp;
		}
	}
}
