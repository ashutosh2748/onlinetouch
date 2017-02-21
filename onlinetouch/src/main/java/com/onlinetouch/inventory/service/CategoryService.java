package com.onlinetouch.inventory.service;

import java.util.List;

import com.onlinetouch.inventory.entity.Category;


public interface CategoryService {
	
	public Category getRootCategory();

	public List<Category> getChildCategory(long categoryId);

	public Category getParentCategory(long categoryId);
}
