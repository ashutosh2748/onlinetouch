package com.onlinetouch.inventory.entity;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class WareHouse {
@Id
long id;
@Embedded
Address address;
@OneToMany
List<Inventory> inventories;


public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public List<Inventory> getInventories() {
	return inventories;
}
public void setInventories(List<Inventory> inventories) {
	this.inventories = inventories;
}
	
}
