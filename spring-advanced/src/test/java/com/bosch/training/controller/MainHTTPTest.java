package com.bosch.training.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import com.bosch.training.entity.Employee;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class MainHTTPTest {
	
	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void test_getEmployees() throws Exception {
		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/employees/2",	Employee.class)).isNotNull();
	}
}
