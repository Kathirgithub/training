package com.bosch.training.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CompanyId implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column
	private int id;
	
	@Column
	private String name;

	public CompanyId() {
		super();
	}

	public CompanyId(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
