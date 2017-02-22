package com.onlinetouch.users.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.onlinetouch.users.entity.WebUser;

public interface WebUserService extends UserDetailsService {
	public WebUser findByUserName(String username);
}
