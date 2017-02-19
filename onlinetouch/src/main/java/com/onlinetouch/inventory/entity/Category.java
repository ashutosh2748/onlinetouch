package com.onlinetouch.inventory.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public abstract class Category {
	@Id
	@GeneratedValue
long id;
String name;
boolean hasproduct;
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
public boolean isHasproduct() {
	return hasproduct;
}
public void setHasproduct(boolean hasproduct) {
	this.hasproduct = hasproduct;
}

}
