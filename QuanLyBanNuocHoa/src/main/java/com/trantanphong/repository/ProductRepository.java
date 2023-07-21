package com.trantanphong.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trantanphong.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
}
