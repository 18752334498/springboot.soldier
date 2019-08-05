package com.yucong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleApplication {
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(SimpleApplication.class);

		application.run(args);
	}
}
