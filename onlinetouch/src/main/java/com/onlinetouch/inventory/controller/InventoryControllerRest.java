package com.onlinetouch.inventory.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinetouch.inventory.entity.Category;
import com.onlinetouch.inventory.entity.Product;
import com.onlinetouch.inventory.entity.ResultPair;
import com.onlinetouch.inventory.service.CategoryService;
import com.onlinetouch.inventory.service.InventoryService;
import com.onlinetouch.inventory.service.ProductService;

@RestController
@RequestMapping({"/Inventory"})
public class InventoryControllerRest {
	@Autowired
	CategoryService categoryservice;
	@Autowired
	ProductService productservice;
	@Autowired
	InventoryService inventoryservice;
	@RequestMapping("")
    public List<ResultPair> home(){
		System.out.println("test");
		Category category=categoryservice.getRootCategory();
		//System.out.println(category);
		long id=category.getId();
		id=2;//dummyfying data to database relationsal case
		List<Product> products=productservice.getProductsByCategory(id);
		System.out.println(products.size());
		List<ResultPair> pairs=new ArrayList<>();
		for(Product p:products){
			System.out.println(p.getTitle());
			long quantity=inventoryservice.getAvailableQuantity(p.getId());
			System.out.println(quantity);
			pairs.add(new ResultPair(p, quantity));
			System.out.println(pairs);
		}
        return pairs;
    }
	@RequestMapping("/i")
    public Category homes(){
		System.out.println("test");
		Category category=categoryservice.getRootCategory();
		//System.out.println(category);
        return category;
    }
}
