package com.onlinetouch.inventory.service;

import com.onlinetouch.inventory.entity.Product;
import com.onlinetouch.inventory.entity.WareHouse;

public interface InventoryService {
	public void addProduct(Product product,WareHouse warehouse);
}
