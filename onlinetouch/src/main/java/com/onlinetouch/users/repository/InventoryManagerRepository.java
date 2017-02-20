package com.onlinetouch.users.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.onlinetouch.users.entity.InventoryManager;

@Repository
public interface InventoryManagerRepository extends CrudRepository<InventoryManager, Long> {
	
}
