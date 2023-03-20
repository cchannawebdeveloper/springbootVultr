package com.spring.boot.vultr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.vultr.model.ResultMessage;
import com.spring.boot.vultr.service.BcryptToolService;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(originPatterns = "http://143.198.172.49:8080")
//@CrossOrigin(originPatterns = "http://localhost:8083")
public class BcryptToolController {
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private BcryptToolService bCryptService;
	
	@RequestMapping(value = "/bcrypt_gnerate", method = RequestMethod.GET
			, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResultMessage getBcryptCode() {
		String pwd = "";
		pwd = passwordEncoder.encode(pwd);
		return new ResultMessage("Sucessfully!", "200", pwd);
	}
	
	@RequestMapping(value = "/bcrypt_gnerate", method = RequestMethod.POST)
	public ResultMessage postBcryptCode(@ModelAttribute(value = "pwd") String pwd) {
		pwd = passwordEncoder.encode(pwd);
		return new ResultMessage("Sucessfully22!", "200", pwd);
	}
	
	@RequestMapping(value = "/bcrypt_gnerate2", method = RequestMethod.POST)
	public ResultMessage postBcryptCode2(
			@RequestParam(value = "rawPwd", required = true) String rawPwd
		 ,  @RequestParam(value = "salt", required = true) Integer salt
		) {
		Integer cleanSalt = bCryptService.checkValidateSalt(salt);
		String pwdG = BCrypt.hashpw(rawPwd, BCrypt.gensalt(cleanSalt));
		return new ResultMessage("SUCCESS", "200", pwdG);
	}
	
	@RequestMapping(value = "/bcrypt_match", method = RequestMethod.POST)
	public ResultMessage bCryptMatch(
			  @RequestParam(value = "rawPwd", required = true) String rawPwd
			, @RequestParam(value = "encodedPwd", required = true) String encodedPwd
			) {
		boolean result = passwordEncoder.matches(rawPwd, encodedPwd);
		if (!result) return new ResultMessage("FAIL", "199", "Not a match!");
		return new ResultMessage("SUCCESS", "200", "Match!");
	}
	
	

}
