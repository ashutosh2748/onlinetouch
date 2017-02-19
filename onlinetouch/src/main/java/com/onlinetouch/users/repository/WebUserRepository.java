package com.onlinetouch.users.repository;

import org.springframework.data.repository.CrudRepository;

import com.onlinetouch.users.entity.WebUser;

public interface WebUserRepository extends CrudRepository<WebUser, Long> {
	public WebUser findByUserName(String userName);
}