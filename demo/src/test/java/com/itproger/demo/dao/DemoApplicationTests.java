package com.itproger.demo.dao;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	@SpringBootApplication
	public static class DemoApplication {

		public static void main(String[] args) {
			SpringApplication.run(com.itproger.demo.dao.DemoApplication.class, args);
		}


	}
}