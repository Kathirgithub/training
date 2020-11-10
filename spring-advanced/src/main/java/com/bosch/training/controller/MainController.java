package com.bosch.training.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bosch.training.entity.Company;
import com.bosch.training.entity.Employee;
import com.bosch.training.exception.EmployeeNotFoundException;
import com.bosch.training.repo.CompanyRepo;
import com.bosch.training.repo.MainRepo;
import com.bosch.training.service.MainService;

@RestController
public class MainController {
	
	@Autowired
	private MainRepo repo;
	
	@Autowired
	private MainService service;
	
	@Autowired
	private CompanyRepo companyRepo;
	

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
			throw new EmployeeNotFoundException("Emp Not found");
		}		
	}
	
	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee emp) {
		return service.createEmployee(emp);
	}
	
	@GetMapping(value = "/companies")
	public List<Company> getCompanies(){
		return companyRepo.findAll();
	}
	
	@GetMapping(value = "/companies/{id}")
	public List<Company> getCompaniesById(@PathVariable(name = "id") int id){
		return companyRepo.findByCompanyIdId(id);
	}
	
	
	
}
