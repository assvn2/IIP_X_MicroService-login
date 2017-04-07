package com.hsbc.group.iip.x;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.hsbc.group.iip")
public class MicroserviceLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceLoginApplication.class, args);
	}
}
