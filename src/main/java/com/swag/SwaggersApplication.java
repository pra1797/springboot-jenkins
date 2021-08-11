package com.swag;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.swag")
public class SwaggersApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggersApplication.class, args);
	}

}
