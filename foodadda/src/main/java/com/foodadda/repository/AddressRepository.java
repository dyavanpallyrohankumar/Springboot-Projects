package com.foodadda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodadda.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
