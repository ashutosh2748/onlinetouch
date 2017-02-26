package com.onlinetouch.controller;

import java.security.Principal;
import java.util.Collection;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	@RequestMapping("/user")
	/*
	 * This is a useful trick in a Spring Security application. If the “/user” resource 
	 * is reachable then it will return the currently authenticated user (an Authentication), 
	 * and otherwise Spring Security will intercept the request and send a 401 
	 * response through an AuthenticationEntryPoint.
	 * */
	public Principal user(Principal user) {
		return user;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> login(Model model, Authentication authentication) {
		System.out.println("AAAAAAA");
		String message = determineTargetUrl(authentication);
		if(message != null){ 
			model.addAttribute("redirectView", message);
			return new ResponseEntity<String>("user", HttpStatus.OK);
		}
		return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
	}
	
	protected String determineTargetUrl(Authentication authentication) {
		Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
		for (GrantedAuthority grantedAuthority : authorities) {
			if (grantedAuthority.getAuthority().equals("ROLE_CUSTOMER")) {
				return "customer";
			} else if (grantedAuthority.getAuthority().equals("ROLE_ADMIN")) {
				return "admin";
			} else if (grantedAuthority.getAuthority().equals("ROLE_INVENTORY_MANAGER")) {
				return "inventory";
			}
		}
		
		return null;	//if user not found
	}
}
