package com.onlinetouch.inventory.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class CompositeCategory extends Category {
	@OneToMany(fetch=FetchType.EAGER)
	@JoinTable(name="childcategories")
	List<Category> childCategories;
	CompositeCategory(){
		hasproduct=false;
	}
	public List<Category> getChildCategories() {
		return childCategories;
	}

	public void setChildCategories(List<Category> childCategories) {
		this.childCategories = childCategories;
	}
}
