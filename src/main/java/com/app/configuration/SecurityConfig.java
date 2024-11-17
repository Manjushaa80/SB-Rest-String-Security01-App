package com.app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception 
	{
		http.authorizeRequests()
		.antMatchers("/student").authenticated()
		.antMatchers("/Employee").authenticated()
		.antMatchers("/admin").authenticated()
		.antMatchers("/home").permitAll()
		.antMatchers("/welcome").permitAll()
		.and()
		.formLogin()
		.and()
		.httpBasic();
		
		return http.build();
		
		

		
		
		
		
	}
	

}
