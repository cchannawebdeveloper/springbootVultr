package com.spring.boot.vultr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping
	public String home() {
		return "home test with Hosting Thanks For visiting!!!!!";
	}
	
	@GetMapping("/test")
	public String test() {
		return "test page";
	}

}
