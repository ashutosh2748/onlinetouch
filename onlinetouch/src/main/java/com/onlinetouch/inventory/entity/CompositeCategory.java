package com.onlinetouch.inventory.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class CompositeCategory extends Category {
	
	CompositeCategory(){
		hasproduct=false;
	}
}
