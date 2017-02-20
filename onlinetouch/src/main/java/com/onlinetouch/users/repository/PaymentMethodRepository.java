package com.onlinetouch.users.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.onlinetouch.users.entity.PaymentMethod;

@Repository
public interface PaymentMethodRepository extends CrudRepository<PaymentMethod, Long> {
	
}