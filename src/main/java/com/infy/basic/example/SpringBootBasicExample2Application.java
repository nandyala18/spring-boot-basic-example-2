package com.infy.basic.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootBasicExample2Application {
	@GetMapping("/")
	public String Welcome()
	{
		return "welcome string";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicExample2Application.class, args);
	}

}
