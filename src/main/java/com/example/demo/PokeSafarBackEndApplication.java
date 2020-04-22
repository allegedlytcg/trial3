package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com.example.demo.model")
@ComponentScan(basePackages = {"com.example.demo.*"})
public class PokeSafarBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokeSafarBackEndApplication.class, args);
	}
}
