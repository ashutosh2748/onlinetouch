package com.onlinetouch.inventory.entity;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Product {
	@Id
	@GeneratedValue
	long id;
	@OneToOne
	@JsonBackReference
	Category categoryleaf;
	@OneToOne
	Brand brand;
	
	//List<Supplier> suppliers;
	BigDecimal sellprice;
	String title;
	String description;
	@OneToMany(mappedBy="product")
    @JsonManagedReference
	List<Inventory> inventories;
	String imgUrl;

	public List<Inventory> getInventories() {
		return inventories;
	}

	public void setInventories(List<Inventory> inventories) {
		this.inventories = inventories;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public void setCategoryleaf(CategoryLeaf categoryleaf) {
		this.categoryleaf = categoryleaf;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Category getCategoryleaf() {
		return categoryleaf;
	}

	public void setCategoryLeaf(Category categoryleaf) {
		this.categoryleaf = categoryleaf;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	/*public List<Supplier> getList() {
		return suppliers;
	}

	public void setList(List<Supplier> list) {
		suppliers = list;
	}*/

	public BigDecimal getSellprice() {
		return sellprice;
	}

	public void setSellprice(BigDecimal sellprice) {
		this.sellprice = sellprice;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
