package com.examaple.springbootapplication;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootFirstappApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootFirstappApplication.class, args);
	}
//	@GetMapping("/hello")
//	public String sayHello(@RequestParam(value = "myName", defaultValue = "Ajay")String name){
//		return String.format("Hello %s",name);
//	}

}
