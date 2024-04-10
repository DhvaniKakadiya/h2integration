package com.dhvani.h2integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class H2integrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(H2integrationApplication.class, args);
	}

}
