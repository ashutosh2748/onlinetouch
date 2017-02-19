package com.onlinetouch.inventory.entity;

import javax.persistence.Entity;

@Entity
public class CategoryLeaf extends Category {

	CategoryLeaf(){
		hasproduct=true;
	}
}
