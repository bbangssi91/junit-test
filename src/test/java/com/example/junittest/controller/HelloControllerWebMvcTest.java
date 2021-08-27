package com.example.junittest.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(HelloController.class)
class HelloControllerWebMvcTest {

	@Autowired
	MockMvc mockMvc;
	
	@Test
	void shouldReturnHelloSpringboot_webLayer() throws Exception{
		this.mockMvc
			.perform(get("/hello"))
			.andDo(print())
			.andExpect(status().isOk())
			.andExpect(content().string("hello-springboot"));
		
	}

}
