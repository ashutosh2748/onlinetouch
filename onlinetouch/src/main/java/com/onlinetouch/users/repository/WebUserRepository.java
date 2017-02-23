package com.onlinetouch.users.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.onlinetouch.users.entity.WebUser;

@Repository
public interface WebUserRepository extends CrudRepository<WebUser, Long> {
	public WebUser findByUserName(String userName);
}