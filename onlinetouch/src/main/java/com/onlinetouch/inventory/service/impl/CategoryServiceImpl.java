package com.onlinetouch.inventory.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinetouch.inventory.entity.Brand;
import com.onlinetouch.inventory.entity.CategoryLeaf;
import com.onlinetouch.inventory.entity.Product;
import com.onlinetouch.inventory.repository.BrandRepository;
import com.onlinetouch.inventory.service.BrandService;
import com.onlinetouch.inventory.service.CategoryService;
@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	BrandRepository brandrepo;

	@Override
	public CategoryLeaf getCategoryLeaf(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProduct(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
