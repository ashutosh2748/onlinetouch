package com.onlinetouch.inventory.repository;

import org.springframework.data.repository.CrudRepository;

import com.onlinetouch.inventory.entity.Inventory;

public interface InventoryRepository extends CrudRepository<Inventory, Long>{

}
