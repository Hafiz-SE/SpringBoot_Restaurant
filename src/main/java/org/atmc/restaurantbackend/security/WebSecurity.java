package org.atmc.restaurantbackend.security;

import org.atmc.restaurantbackend.service.UserService;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity 
public class WebSecurity extends WebSecurityConfigurerAdapter {
	

	private final UserService userService;
	private final BCryptPasswordEncoder bCryptPasswordEncoder;
	
	
	public WebSecurity(UserService userServices, BCryptPasswordEncoder bCryptPasswordEncoder) {
		this.userService = userServices;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.csrf().disable().authorizeRequests().
		antMatchers(HttpMethod.POST,"/users").permitAll().anyRequest().authenticated();
	}
	
	@Override 
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userService).passwordEncoder(bCryptPasswordEncoder);
	}
	
	
 
}
