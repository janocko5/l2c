package com.janocko.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Hellocontroler {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}