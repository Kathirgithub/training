package com.bosch.training.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bosch.training.entity.Employee;
import com.bosch.training.repo.MainRepo;

@RestController
public class MainController {
	
	@Autowired
	private MainRepo repo;
	

	@GetMapping(value = "/employees")
	public List<Employee> getEmployees(){
		return repo.findAll();
	}

	
	@GetMapping(value = "/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable(name = "id") int id){
		Optional<Employee> emp = repo.findById(id);
		if(emp.isPresent()) {
			return new ResponseEntity<>(emp.get(),HttpStatus.OK);
		} else {
			return ResponseEntity.notFound().build();
		}
		
	}
	
}
