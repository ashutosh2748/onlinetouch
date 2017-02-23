package com.onlinetouch.users.repository;

import org.springframework.data.repository.CrudRepository;

import com.onlinetouch.users.entity.Admin;

public interface AdminRepository extends CrudRepository<Admin, Long> {
	
}
