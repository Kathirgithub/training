package com.bosch.training.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bosch.training.entity.Company;
import com.bosch.training.entity.CompanyId;

@Repository
public interface CompanyRepo extends JpaRepository<Company, CompanyId>{

	List<Company> findByCompanyIdId(int id);
}
