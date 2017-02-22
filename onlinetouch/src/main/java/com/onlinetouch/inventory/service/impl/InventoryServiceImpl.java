package com.onlinetouch.inventory.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinetouch.inventory.entity.Inventory;
import com.onlinetouch.inventory.entity.Product;
import com.onlinetouch.inventory.entity.WareHouse;
import com.onlinetouch.inventory.repository.InventoryRepository;
import com.onlinetouch.inventory.repository.ProductRepository;
import com.onlinetouch.inventory.repository.WareHouseRepository;
import com.onlinetouch.inventory.service.InventoryService;
@Service
@Transactional
public class InventoryServiceImpl implements InventoryService {
	@Autowired
	InventoryRepository inventoryrepo;
	@Autowired
	ProductRepository productrepo;
	@Autowired
	WareHouseRepository warehouserepo;

	@Override
	public void addProduct(long productId, long quantity,long warehouseId) {
		Product product=productrepo.findOne(productId);
		WareHouse warehouse=warehouserepo.findOne(warehouseId);
		Inventory inventory= inventoryrepo.findOneByProductandwareHouse(product, warehouse);
		if(inventory!=null)inventory.setQuantity(inventory.getQuantity()+quantity);
		inventoryrepo.save(inventory);
	}

	@Override
	public long getAvailableQuantity(long productId) {
		Product product=productrepo.findOne(productId);
		Iterable<Inventory> inventories = product.getInventories();
		long count = 0;
		for (Inventory inven : inventories) {
			count += inven.getQuantity();
			count -= inven.getLockedQuantity();
			count -= inven.getOrderedQuantity();
		}
		return count;
	}

	@Override
	public WareHouse lockQuantity(long productId, long quantity) {
		Product product=productrepo.findOne(productId);
		Inventory inventory = inventoryrepo.findOne(product, quantity);
		inventory.setLockedQuantity(inventory.getLockedQuantity() + quantity);
		inventoryrepo.save(inventory);
		return inventory.getWarehouse();

	}
	
	@Override
	public void unlockQuantity(long productId, long quantity,long warehouseId) {
		Product product=productrepo.findOne(productId);
		WareHouse warehouse=warehouserepo.findOne(warehouseId);
		Inventory inventory = inventoryrepo.findOneByProductandwareHouse(product,warehouse);
		inventory.setLockedQuantity(inventory.getLockedQuantity() - quantity);
		inventoryrepo.save(inventory);
		

	}
}
