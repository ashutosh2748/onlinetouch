package com.onlinetouch.inventory.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;

import com.onlinetouch.users.entity.Address;

@Entity
public class Supplier {
long id;
String name;
@Embedded
Address address;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
}
