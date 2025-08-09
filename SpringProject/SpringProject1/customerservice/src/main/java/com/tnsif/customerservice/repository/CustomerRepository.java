package com.tnsif.customerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tnsif.customerservice.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    // You can add custom query methods if needed
    Customer findByEmail(String email);
    Customer findByPhoneNumber(String phoneNumber);
}
