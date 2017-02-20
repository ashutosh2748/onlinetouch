package com.onlinetouch.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.onlinetouch.payment.entity.ShoppingCart;


@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long>{
	
	@Query(value="SELECT s FROM ShoppingCart s")
	public ShoppingCart findByTotalPrice();
	
	@Query("select sc from ShoppingCart sc where sc.order.id = :id")
	ShoppingCart findByOrderId(@Param("id") long id);
}
