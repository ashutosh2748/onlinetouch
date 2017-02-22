package com.onlinetouch.inventory.service;

import com.onlinetouch.inventory.entity.Product;
import com.onlinetouch.inventory.entity.WareHouse;

public interface InventoryService {
	
	public WareHouse lockQuantity(long productId, long quantity);

	public long getAvailableQuantity(long productId);

	public void unlockQuantity(long productId, long quantity, long wareHouseId);

	public void addProduct(long productId, long quantity,long warehouseId);
}
