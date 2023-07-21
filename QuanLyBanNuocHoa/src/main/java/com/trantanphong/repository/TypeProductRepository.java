package com.trantanphong.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trantanphong.entity.TypeProduct;

public interface TypeProductRepository extends JpaRepository<TypeProduct, Long>{
	TypeProduct findByNameType(String nameType);
}
