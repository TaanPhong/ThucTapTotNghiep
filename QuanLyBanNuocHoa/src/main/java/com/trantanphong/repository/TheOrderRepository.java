package com.trantanphong.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trantanphong.entity.TheOrder;

public interface TheOrderRepository extends JpaRepository<TheOrder, Long>{

}
