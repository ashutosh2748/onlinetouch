package com.onlinetouch.inventory.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.onlinetouch.inventory.entity.Product;
import com.onlinetouch.inventory.repository.ProductRepository;
import com.onlinetouch.inventory.service.ProductService;

public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductRepository repository;
	@Override
	public List<Product> getProductsByCategory(long categoryId) {
		// TODO Auto-generated method stub
		return repository.findAllProductByCategory(categoryId);
		//return null;
		
	}
	

}
