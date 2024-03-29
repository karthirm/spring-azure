package com.learning.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureApplication {

	@GetMapping("/message")
	public String message(){
		return "Azure deployment is working";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureApplication.class, args);
	}

}
