package com.onlinetouch.inventory.entity;

import javax.persistence.Entity;

@Entity
public class CompositeCategory extends Category {

	CompositeCategory(){
		hasproduct=false;
	}
}
