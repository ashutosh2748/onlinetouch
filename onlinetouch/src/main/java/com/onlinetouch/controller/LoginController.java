package com.onlinetouch.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
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
}
