package com.onlinetouch.inventory.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Inventory {
	@Id
	@GeneratedValue
	long id;
	long quantity;
	long lockedQuantity;
	long orderedQuantity;
	Date entryDate;
	@OneToOne
	@JsonBackReference
	Product product;
	@OneToOne
	@JsonBackReference
	WareHouse warehouse;
	
	public long getLockedQuantity() {
		return lockedQuantity;
	}

	public void setLockedQuantity(long lockedQuantity) {
		this.lockedQuantity = lockedQuantity;
	}

	public long getOrderedQuantity() {
		return orderedQuantity;
	}

	public void setOrderedQuantity(long orderedQuantity) {
		this.orderedQuantity = orderedQuantity;
	}

	

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

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
