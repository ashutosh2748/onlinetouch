package com.onlinetouch.inventory.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Inventory {
	@Id
	long id;
	Date entryDate;
	@OneToOne
	Product product;
	@OneToOne
	WareHouse warehouse;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public WareHouse getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(WareHouse warehouse) {
		this.warehouse = warehouse;
	}
}
