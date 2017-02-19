package com.onlinetouch.inventory.service.impl;


import org.springframework.beans.factory.annotation.Autowired;

import com.onlinetouch.inventory.entity.Inventory;
import com.onlinetouch.inventory.entity.Product;
import com.onlinetouch.inventory.entity.WareHouse;
import com.onlinetouch.inventory.repository.InventoryRepository;
import com.onlinetouch.inventory.service.InventoryService;

public class InventoryServiceImpl implements InventoryService{
	@Autowired
	InventoryRepository inventoryrepo;

	@Override
	public void addProduct(Product product, WareHouse warehouse) {
		
	}
	public long getAvailableQuantity(Product product){
		Iterable<Inventory> inventories=inventoryrepo.findAll();
		long count=0;

		for(Inventory inven:inventories){
		count+=inven.getQuantity();
		count-=inven.getLockedQuantity();
		count-=inven.getOrderedQuantity();
		}
		return count;
	}
	public WareHouse lockQuantity(Product product,long quantity){
		Inventory inventory=inventoryrepo.findOne(product,quantity);
		inventory.setLockedQuantity(inventory.getLockedQuantity()+quantity);
		return inventory.getWarehouse();
		
	}
	

}
