package com.onlinetouch.inventory.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinetouch.inventory.entity.Brand;
import com.onlinetouch.inventory.repository.BrandRepository;
import com.onlinetouch.inventory.service.BrandService;
@Service
public class BrandServiceImpl implements BrandService {
	@Autowired
	BrandRepository brandrepo;

	@Override
	public Brand getBrand(long id) {
		return brandrepo.findOne(id);
	}

}
