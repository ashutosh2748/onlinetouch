package com.onlinetouch.inventory.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.onlinetouch.inventory.entity.Inventory;
import com.onlinetouch.inventory.entity.Product;
import com.onlinetouch.inventory.entity.WareHouse;

public interface InventoryRepository extends CrudRepository<Inventory, Long>{
	@Query("from Inventory i where i.id=1")
	Inventory findOne(@Param("product")Product product, @Param("quantity")long quantity);
	//Query to Be verified
	@Query("from Inventory i where i.product=:product and i.warehouse=:warehouse")
	Inventory findOneByProductandwareHouse(@Param("product")Product product, @Param("warehouse")WareHouse warehouse);
	
	

}
