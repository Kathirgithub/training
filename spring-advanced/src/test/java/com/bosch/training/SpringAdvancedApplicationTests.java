package com.bosch.training;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bosch.training.controller.DummyController;
import com.bosch.training.controller.MainController;

@SpringBootTest
class SpringAdvancedApplicationTests {
	
	@Autowired
	MainController mainCtrler;
	
	@Autowired
	DummyController dummyCtrler;
	
	@Test
	void contextLoads() {
		assertThat(mainCtrler).isNotNull();
		assertThat(dummyCtrler).isNotNull();
	}

}
