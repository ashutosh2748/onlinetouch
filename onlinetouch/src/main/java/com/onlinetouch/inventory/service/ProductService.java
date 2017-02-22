package com.onlinetouch.inventory.service;

import java.util.List;

import com.onlinetouch.inventory.entity.Product;

public interface ProductService {
public List<Product> getProductsByCategory(long categoryId);
}
