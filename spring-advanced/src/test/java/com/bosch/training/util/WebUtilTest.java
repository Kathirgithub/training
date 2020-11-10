package com.bosch.training.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WebUtilTest {
	
	@Test
	void test_getDayOfWeek() {
		String day = WebUtil.getDayOfWeek(3);
		assertEquals("Tuesday", day);
	}

}
