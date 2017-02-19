package com.onlinetouch.inventory.repository;

import org.springframework.data.repository.CrudRepository;

import com.onlinetouch.inventory.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
