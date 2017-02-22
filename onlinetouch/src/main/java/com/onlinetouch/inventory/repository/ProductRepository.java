package com.onlinetouch.inventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.onlinetouch.inventory.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

	@Query("from Product p where p.categoryleaf.id=:category")
	List<Product> findAllProductByCategory(@Param(value="category")long categoryId);

}
