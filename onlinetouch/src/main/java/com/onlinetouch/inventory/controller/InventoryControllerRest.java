package com.onlinetouch.inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinetouch.inventory.entity.Category;
import com.onlinetouch.inventory.service.CategoryService;

@RestController
@RequestMapping({"/Inventory"})
public class InventoryControllerRest {
	@Autowired
	CategoryService categoryservice;
	@RequestMapping("")
    public String home(){
		System.out.println("test");
		Category category=categoryservice.getRootCategory();
		//System.out.println(category);
		StringBuilder builder=new StringBuilder();
		
        return category.getName();
    }
	@RequestMapping("/i")
    public Category homes(){
		System.out.println("test");
		Category category=categoryservice.getRootCategory();
		//System.out.println(category);
        return category;
    }
}
