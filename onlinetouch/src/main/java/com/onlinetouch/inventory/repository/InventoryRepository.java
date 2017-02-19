package com.onlinetouch.inventory.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.onlinetouch.inventory.entity.Inventory;
import com.onlinetouch.inventory.entity.Product;

public interface InventoryRepository extends CrudRepository<Inventory, Long>{
	@Query("from Inventory i join product p where i.product=:product and i.quantity=:quantity limit 1")
	Inventory findOne(@Param("product")Product product, @Param("quantity")long quantity);
	//Query to Be verified
	
	

}
