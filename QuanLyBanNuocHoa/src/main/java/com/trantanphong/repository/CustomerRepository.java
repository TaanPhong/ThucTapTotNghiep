package com.trantanphong.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trantanphong.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
