package com.example.junittest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import com.example.junittest.controller.TestController;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class JunitTestApplicationTests {

	@Autowired
	private TestController testController;
	
	@Test
	void contextLoads() {
		Assertions.assertThat(testController).isNotNull();
	}
}
