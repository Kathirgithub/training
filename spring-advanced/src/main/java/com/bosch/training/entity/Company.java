package com.bosch.training.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Company {

	@EmbeddedId
	private CompanyId companyId;
	
	@Column
	private String location;

	public Company() {
		super();
	}

	public Company(CompanyId companyId, String location) {
		super();
		this.companyId = companyId;
		this.location = location;
	}

	public CompanyId getCompanyId() {
		return companyId;
	}

	public void setCompanyId(CompanyId companyId) {
		this.companyId = companyId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
