package com.capg.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ecommerce {

	public static void main(String[] args) {
		SpringApplication.run(Ecommerce.class, args);
		System.out.println("Server Started");
	}

}