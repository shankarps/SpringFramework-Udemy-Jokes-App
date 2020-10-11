package com.shankar.springframework.guru.jokesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:configuration.xml")
@ComponentScan(basePackages = "com.shankar.springframework.guru.jokesapp")
public class JokesappApplication {

	public static void main(String[] args) {
		SpringApplication.run(JokesappApplication.class, args);
	}

}
