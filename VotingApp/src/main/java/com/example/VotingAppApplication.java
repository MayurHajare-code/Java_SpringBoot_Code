package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VotingAppApplication {

	public static void main(String[] args) {
		System.out.println("Application run successfully...");
		SpringApplication.run(VotingAppApplication.class, args);
	}

}
