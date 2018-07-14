package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.service", "com.config","com.controller" })

public class DepedancyInjectionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepedancyInjectionServiceApplication.class, args);
	}
}
