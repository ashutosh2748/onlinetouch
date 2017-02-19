package com.onlinetouch.inventory.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.onlinetouch.inventory.entity.Inventory;
import com.onlinetouch.inventory.entity.Product;
import com.onlinetouch.inventory.entity.WareHouse;
import com.onlinetouch.inventory.repository.InventoryRepository;
import com.onlinetouch.inventory.service.InventoryService;
@Transactional
public class InventoryServiceImpl implements InventoryService {
	@Autowired
	InventoryRepository inventoryrepo;

	@Override
	public void addProduct(Product product, WareHouse warehouse,long count) {
		Inventory inventory= inventoryrepo.findOneByProductandwareHouse(product, warehouse);
		if(inventory!=null)inventory.setQuantity(inventory.getQuantity()+count);
		inventoryrepo.save(inventory);
	}

	@Override
	public long getAvailableQuantity(Product product) {
		Iterable<Inventory> inventories = inventoryrepo.findAll();
		long count = 0;
		for (Inventory inven : inventories) {
			count += inven.getQuantity();
			count -= inven.getLockedQuantity();
			count -= inven.getOrderedQuantity();
		}
		return count;
	}

	@Override
	public WareHouse lockQuantity(Product product, long quantity) {
		Inventory inventory = inventoryrepo.findOne(product, quantity);
		inventory.setLockedQuantity(inventory.getLockedQuantity() + quantity);
		inventoryrepo.save(inventory);
		return inventory.getWarehouse();

	}
	
	@Override
	public void unlockQuantity(Product product, long quantity,WareHouse warehouse) {
		Inventory inventory = inventoryrepo.findOneByProductandwareHouse(product,warehouse);
		inventory.setLockedQuantity(inventory.getLockedQuantity() - quantity);
		inventoryrepo.save(inventory);
		

	}
}
