package com.spring.boot.vultr.service;

import org.springframework.stereotype.Service;

@Service
public class BcryptToolService {
	
	public int checkValidateSalt(Integer salt) {
		if(salt < 4) return 4;
		else if (salt > 15) return 15;
		return salt;
	}

}
