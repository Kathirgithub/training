package com.bosch.training.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bosch.training.entity.Employee;

@Repository
public interface MainRepo extends JpaRepository<Employee, Integer> {
	
}