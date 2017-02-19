package com.onlinetouch.inventory.service;

import com.onlinetouch.inventory.entity.CategoryLeaf;
import com.onlinetouch.inventory.entity.Product;

public interface CategoryService {
	public CategoryLeaf getCategoryLeaf(Product product);

	public Product getProduct(Long id);
}
