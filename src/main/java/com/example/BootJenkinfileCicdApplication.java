package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BootJenkinfileCicdApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootJenkinfileCicdApplication.class, args);
	}

	@GetMapping("/jenkin")
	public String cicd() {
		return "welcome to cicd jenkins...";
	}
}
