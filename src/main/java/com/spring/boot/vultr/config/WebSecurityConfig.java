package com.spring.boot.vultr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter  {
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	    http.cors().and().csrf().disable();
	    http.authorizeRequests()
	    .antMatchers("/").permitAll()
		.antMatchers("/admin").hasRole("ADMIN")
		.antMatchers("/user").hasAnyRole("ADMIN","USER")
		
		.and()
		.formLogin();

	}
	
	@Bean
	 public PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	  }
	
	@Bean
	public BCrypt bCryptEncoder() {
		return new BCrypt();
	}

}
