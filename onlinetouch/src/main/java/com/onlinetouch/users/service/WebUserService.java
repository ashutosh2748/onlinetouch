package com.onlinetouch.users.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.onlinetouch.users.entity.WebUser;

public interface WebUserService extends UserDetailsService {
	public void addWebUser(WebUser user);
	public void removeWebUser(Long id);
	public List<WebUser> getAllWebUsers();
	public WebUser findById(Long id);
	public WebUser findByUserName(String username);
}
