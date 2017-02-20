package com.onlinetouch.users.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.onlinetouch.users.entity.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {

}
