package com.onlinetouch.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.onlinetouch.payment.entity.OrderLine;

@Repository
public interface OrderLineRepository extends JpaRepository<OrderLine, Long> {

	@Query("select o from OrderLine o where o.product.id = :id")
	OrderLine findByProductId(@Param("id") long id);
}
