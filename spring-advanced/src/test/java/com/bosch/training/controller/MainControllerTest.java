package com.bosch.training.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.bosch.training.entity.Employee;
import com.bosch.training.repo.MainRepo;

@SpringBootTest
@AutoConfigureMockMvc
public class MainControllerTest {

	@Autowired
	MockMvc mockMvc;

	@MockBean
	MainRepo repo;

	@Test
	public void test_GetEmployees_status() throws URISyntaxException, Exception {
		this.mockMvc.perform(get(new URI("/employees"))).andExpect(status().isOk());
	}

	@Test
	public void test_GetEmployees_data() throws URISyntaxException, Exception {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(5,"f","l","","",null));
		employees.add(new Employee(6,"f2","l2","","",null));
		
		when(repo.findAll()).thenReturn(employees);

		this.mockMvc.perform(get(new URI("/employees"))).andExpect(jsonPath("$[1].id", is(6)));
	}

}
