package com.example.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class spring {

    @RequestMapping("/")
        public String home() {
        return "Hello World";
    }

	public static void main(String[] args) {
		SpringApplication.run(spring.class, args);
	}

}
