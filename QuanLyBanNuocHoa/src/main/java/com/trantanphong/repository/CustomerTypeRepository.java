package com.trantanphong.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trantanphong.entity.CustomerType;

public interface CustomerTypeRepository extends JpaRepository<CustomerType, Long>{

}
