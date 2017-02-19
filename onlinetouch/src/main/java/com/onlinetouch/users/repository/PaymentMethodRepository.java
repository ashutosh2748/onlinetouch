package com.onlinetouch.users.repository;

import org.springframework.data.repository.CrudRepository;

import com.onlinetouch.users.entity.PaymentMethod;

public interface PaymentMethodRepository extends CrudRepository<PaymentMethod, Long> {
	
}