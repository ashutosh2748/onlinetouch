package com.onlinetouch.inventory.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Category {
	@Id
	@GeneratedValue
	long id;
	String name;
	boolean hasproduct;
	//@ManyToOne
	//@JoinTable(name="childcategories")
	//Category parent;
	
	

	

	/*public Category getParent() {
		return parent;
	}

	public void setParent(Category parent) {
		this.parent = parent;
	}*/
	public abstract List<Category> getChildCategories();

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
