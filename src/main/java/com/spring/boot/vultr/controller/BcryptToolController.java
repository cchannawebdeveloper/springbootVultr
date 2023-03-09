package com.spring.boot.vultr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.vultr.model.ResultMessage;

@RestController
@RequestMapping("/api/v1")
public class BcryptToolController {
	
	
	@GetMapping("/bcrypt_gnerate")
	public ResultMessage getBcryptCode() {
		
		return new ResultMessage("Sucessfully!", "200", "Request Succesfully");
	}

}
