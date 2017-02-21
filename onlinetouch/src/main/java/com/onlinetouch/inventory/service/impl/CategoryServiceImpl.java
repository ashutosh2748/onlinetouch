package com.onlinetouch.inventory.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinetouch.inventory.entity.Category;
import com.onlinetouch.inventory.repository.CategoryRepository;
import com.onlinetouch.inventory.service.CategoryService;
@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	CategoryRepository categoryrepo;

		
	@Override
	public Category getRootCategory() {
		return categoryrepo.findOne((long)1);
	}

	@Override
	public List<Category> getChildCategory(long categoryId) {
		Category category=getCategory(categoryId);
		return category.getChildCategories();
	}
	
	@Override
	public Category getParentCategory(long categoryId) {
		
		Category category=getCategory(categoryId);
		if(categoryId==1) return category;
		return category.getParent();
	}
	
	private Category getCategory(long id) {
		
		return categoryrepo.findOne(id);
	}
	
}
