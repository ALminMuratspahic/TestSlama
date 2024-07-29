package com.TestSlama;

import java.util.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestSlamaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSlamaApplication.class, args);
		Logger logger = Logger.getLogger(TestSlamaApplication.class.getName());
		logger.info("Info message");
	}

}
