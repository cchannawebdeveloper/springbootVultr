package com.spring.boot.vultr.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.vultr.model.ResultMessage;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(originPatterns = "http://143.198.172.49:8080")
public class BcryptToolController {
	
	@RequestMapping(value = "/bcrypt_gnerate", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResultMessage getBcryptCode() {
		return new ResultMessage("Sucessfully!", "200", "Request Succesfully");
	}

}
