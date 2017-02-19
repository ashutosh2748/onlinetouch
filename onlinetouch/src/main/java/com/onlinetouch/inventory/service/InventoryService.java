package com.onlinetouch.inventory.service;

import com.onlinetouch.inventory.entity.Product;
import com.onlinetouch.inventory.entity.WareHouse;

public interface InventoryService {
	
	public WareHouse lockQuantity(Product product, long quantity);

	public long getAvailableQuantity(Product product);

	public void unlockQuantity(Product product, long quantity, WareHouse warehouse);

	public void addProduct(Product product, WareHouse warehouse, long count);
}
