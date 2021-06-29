package com.sapient.trg.pl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.sapient.trg.service.HelloWorld;

class HelloWorldTest {
    private HelloWorld helloWorld = null;
	@BeforeEach
	void setUp() throws Exception {
		helloWorld = new HelloWorld("Hi this is my first assignment");
	}

	@AfterEach
	void tearDown() throws Exception {
		helloWorld = null;
	}
  
	@Test
	void test_getMessage() {
		assertEquals("Hi this is my first assignment",helloWorld.getMessage());
	}

}
