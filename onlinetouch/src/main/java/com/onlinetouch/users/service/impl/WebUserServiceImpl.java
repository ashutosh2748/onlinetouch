package com.onlinetouch.users.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.onlinetouch.users.entity.WebUser;
import com.onlinetouch.users.repository.WebUserRepository;
import com.onlinetouch.users.service.WebUserService;

@Service
@Transactional
public class WebUserServiceImpl implements WebUserService {

	@Autowired
	private WebUserRepository webUserRepository;
	
	@Override
	public void addWebUser(WebUser user) {
		webUserRepository.save(user);
	}

	@Override
	public void removeWebUser(Long id) {
		webUserRepository.delete(id);
	}

	@Override
	public List<WebUser> getAllWebUsers() {
		return (List<WebUser>) webUserRepository.findAll();
	}

	@Override
	public WebUser findById(Long id) {
		return webUserRepository.findOne(id);
	}

	@Override
	public WebUser findByUserName(String username) {
		return webUserRepository.findByUserName(username);
	}
	
}