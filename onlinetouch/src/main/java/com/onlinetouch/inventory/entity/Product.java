package com.onlinetouch.inventory.entity;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Product {
	@Id
	@GeneratedValue
	long id;
	@OneToOne
	CategoryLeaf categoryleaf;
	@OneToOne
	Brand brand;
	
	//List<Supplier> suppliers;
	BigDecimal sellprice;
	String title;
	String description;
	//List<Inventory> inventories;
	String imgUrl;

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

	public CategoryLeaf getCategoryleaf() {
		return categoryleaf;
	}

	public void setCategoryLeaf(CategoryLeaf categoryleaf) {
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
