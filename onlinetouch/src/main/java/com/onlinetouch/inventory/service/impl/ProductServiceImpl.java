package com.onlinetouch.inventory.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinetouch.inventory.entity.Product;
import com.onlinetouch.inventory.repository.ProductRepository;
import com.onlinetouch.inventory.service.ProductService;
@Service
@Transactional
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
