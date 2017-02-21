package com.onlinetouch.inventory.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class CategoryLeaf extends Category {
	@OneToMany(mappedBy="categoryleaf")
	List<Product> products;
	CategoryLeaf(){
		hasproduct=true;
	}
	public List<Product> getProduct() {
		return products;
	}
	public void setProduct(List<Product> product) {
		this.products = product;
	}
	public void addProduct(Product product) {
		products.add(product);
	}
	public void removeProduct(Product product) {
		products.remove(product);
	}
	@Override
	public List<Category> getChildCategories() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
