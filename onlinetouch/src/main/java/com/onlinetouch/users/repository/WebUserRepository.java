package com.onlinetouch.users.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.onlinetouch.users.entity.WebUser;

@NoRepositoryBean
public interface WebUserRepository extends CrudRepository<WebUser, Long> {
	public WebUser findByUserName(String userName);
}