package com.onlinetouch.users.repository;

import org.springframework.data.repository.CrudRepository;

import com.onlinetouch.users.entity.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {

}
