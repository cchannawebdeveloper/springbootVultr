package com.spring.boot.vultr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@GetMapping("/h2")
	public String home() {
		return "home";
	}
	
	@GetMapping("/h3")
	public String home2() {
		System.out.println("home 3 work");
		return "home2";
	}

}
