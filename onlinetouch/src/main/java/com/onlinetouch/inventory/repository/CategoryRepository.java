package com.onlinetouch.inventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.onlinetouch.inventory.entity.Category;

public interface CategoryRepository extends CrudRepository<Category, Long>{

	
//	@Query("from Category where id=:category")  //TODO
//	public List<Category> findChilds(@Param("category")long categoryId);

	//public List<Category> findChilds(long categorId);
	
}
